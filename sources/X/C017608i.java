package X;

import com.facebook.analytics2.logger.DefaultFalcoAcsProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.08i  reason: invalid class name and case insensitive filesystem */
public final class C017608i extends C04950Qa {
    public final File A00;
    public final Pattern A01 = Pattern.compile("<falco_acs_placeholder_claim>");
    public final AnonymousClass0AW A02;
    public final DefaultFalcoAcsProvider A03;

    public final void A04() {
    }

    public final int A00() {
        return Math.round((float) this.A00.length());
    }

    public final AnonymousClass0AV A01() {
        return this.A02.A02(this.A00);
    }

    public final void A03() {
        File file = this.A00;
        if (!file.delete()) {
            AnonymousClass0LU.A0O("FileBatchPayloadIterator", "Failed to remove %s", file);
        }
    }

    public final void A05(Writer writer) {
        C02430Bi r6 = new C02430Bi(new FileInputStream(this.A00), ByteBuffer.wrap((byte[]) C04950Qa.A03.get()));
        try {
            char[] cArr = (char[]) C04950Qa.A04.get();
            boolean z = false;
            while (true) {
                int read = r6.read(cArr);
                if (read == -1) {
                    return;
                }
                if (!z) {
                    Matcher matcher = this.A01.matcher(CharBuffer.wrap(cArr));
                    int i = 0;
                    while (matcher.find()) {
                        int start = matcher.start();
                        i = matcher.end();
                        writer.write(cArr, 0, start);
                    }
                    writer.write(cArr, i, read - i);
                    z = true;
                } else {
                    writer.write(cArr, 0, read);
                }
            }
        } finally {
            r6.close();
        }
    }

    public C017608i(AnonymousClass0AT r2, AnonymousClass0AW r3, DefaultFalcoAcsProvider defaultFalcoAcsProvider, File file) {
        super(r2, file);
        this.A00 = file;
        this.A02 = r3;
        this.A03 = defaultFalcoAcsProvider;
    }
}
