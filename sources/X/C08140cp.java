package X;

import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0cp  reason: invalid class name and case insensitive filesystem */
public final class C08140cp implements C03760Kq {
    public final MultiBufferLogger A00;

    public final void ACr(Class cls, String str) {
        this.A00.writeStandardEntry(6, 81, 0, 0, 0, 0, ClassId.getClassId(cls));
    }

    public final void ACs(String str) {
        this.A00.writeStandardEntry(6, 82, 0, 0, 0, 0, 0);
    }

    public final void ACt(String str) {
        this.A00.writeStandardEntry(6, 80, 0, 0, 0, 0, 0);
    }

    public C08140cp(MultiBufferLogger multiBufferLogger) {
        this.A00 = multiBufferLogger;
    }
}
