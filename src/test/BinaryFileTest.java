package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BinaryFileTest {
	
	public static void main(String[] args) {
		//ByteBuffer byteBuffer = ByteBuffer.allocate(10000);
		FileChannel out;
		Buffer buffer = new Buffer();
		try {
			/*byteBuffer.clear();
			byteBuffer.putInt(5);
			byteBuffer.putShort((short)40);
			byteBuffer.putChar('c');
			byteBuffer.putChar('e');
			byteBuffer.putChar('c');
			byteBuffer.putChar('i');
			byteBuffer.putChar('\0');
			byteBuffer.flip();
			byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
			out = new FileOutputStream("test.txt").getChannel();
			out.write(byteBuffer);
			out.close();*/
			buffer.writeInt(5);
			buffer.writeString("Blabla bla");
			buffer.flip();
			buffer.order(ByteOrder.LITTLE_ENDIAN);
			FileOutputStream outputStream = new FileOutputStream("test.txt");
			out = outputStream.getChannel();
			out.write(buffer.getBuffer());
			out.close();
			outputStream.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		FileChannel fc;
		try {
			fc = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.READ);
			buffer = new Buffer();
			buffer.order(ByteOrder.BIG_ENDIAN);
			fc.read(buffer.getBuffer());
			buffer.flip();
			while(buffer.hasRemaining()) {
				System.out.println(buffer.readInt());
				System.out.println(buffer.readString());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
