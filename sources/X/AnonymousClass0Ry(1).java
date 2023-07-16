package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.0Ry  reason: invalid class name */
public final class AnonymousClass0Ry extends AnonymousClass0AW {
    public static AnonymousClass0AW A00;

    public final /* bridge */ /* synthetic */ AnonymousClass0AV A03(Object obj) {
        File file = (File) obj;
        try {
            return new C05220Rz(this, file);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Unexpected error, failed to create file: ");
            sb.append(file);
            throw new C02210Ag(sb.toString(), e);
        }
    }
}
