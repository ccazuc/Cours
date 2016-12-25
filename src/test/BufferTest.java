package test;

import java.nio.ByteBuffer;

public class BufferTest {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(16000);
		int i = 0;
		//System.out.println(buffer.remaining());
		while(i < 50) {
			buffer.putInt(i);
			i++;
		}
		/*i = 0;
		while(buffer.hasRemaining()) {
			System.out.println(buffer.getInt());
		}*/
		System.out.println("--------------------");
		buffer.position(40);
		//buffer.putInt(666);
		buffer.flip();
		//System.out.println(buffer.remaining());
		while(buffer.hasRemaining()) {
			System.out.println(buffer.getInt());
		}
	}
}
