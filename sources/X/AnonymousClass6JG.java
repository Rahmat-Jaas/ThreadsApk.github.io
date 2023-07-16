package X;

import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: X.6JG  reason: invalid class name */
public final class AnonymousClass6JG {
    public static String A00(Readable readable) {
        StringBuilder A0r = C18200wM.A0r();
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            reader.getClass();
            char[] cArr = new char[2048];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    break;
                }
                A0r.append(cArr, 0, read);
            }
        } else {
            CharBuffer allocate = CharBuffer.allocate(2048);
            while (readable.read(allocate) != -1) {
                allocate.flip();
                A0r.append(allocate);
                allocate.clear();
            }
        }
        return A0r.toString();
    }
}
