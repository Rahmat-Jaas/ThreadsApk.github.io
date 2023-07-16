package X;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0NZ  reason: invalid class name */
public final class AnonymousClass0NZ extends AnonymousClass0Y5 {
    public final C04420Nn A00;
    public final Map A01 = new ConcurrentHashMap();

    public final void A02(File file, String str, List list, Properties properties, boolean z) {
        FileOutputStream fileOutputStream;
        if ("perf".equals(str)) {
            try {
                Map map = this.A01;
                C06160Xx r1 = (C06160Xx) map.get(file.getPath());
                if (r1 == null) {
                    r1 = this.A00.AEw(file, 4096);
                    AnonymousClass0SJ.A00(r1);
                    map.put(file.getPath(), r1);
                }
                MappedByteBuffer mappedByteBuffer = r1.A00;
                mappedByteBuffer.clear();
                for (Map.Entry entry : properties.entrySet()) {
                    String obj = entry.getKey().toString();
                    String obj2 = entry.getValue().toString();
                    mappedByteBuffer.put(AnonymousClass0Y5.A00(obj, true).getBytes("Ascii"));
                    mappedByteBuffer.put("=".getBytes("Ascii"));
                    mappedByteBuffer.put(AnonymousClass0Y5.A00(obj2, false).getBytes("Ascii"));
                    mappedByteBuffer.put("\n".getBytes("Ascii"));
                }
                mappedByteBuffer.put("#".getBytes("Ascii"));
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            super.A02(file, str, (List) null, properties, false);
        }
    }

    public AnonymousClass0NZ(C04420Nn r2) {
        this.A00 = r2;
    }
}
