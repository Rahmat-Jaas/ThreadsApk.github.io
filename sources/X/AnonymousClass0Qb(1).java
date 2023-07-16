package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.Writer;
import java.util.List;

/* renamed from: X.0Qb  reason: invalid class name */
public final class AnonymousClass0Qb implements C05500Tz {
    public final AnonymousClass0AT A00;
    public final List A01;
    public volatile boolean A02;

    public final boolean BWF() {
        return true;
    }

    public final int Ag8() {
        List list = this.A01;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C017608i) list.get(i2)).A00();
        }
        return i + 256;
    }

    public final void Beo() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C04950Qa) list.get(i)).Beo();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void DBS(Writer writer) {
        if (!this.A02) {
            List list = this.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C04950Qa) list.get(i)).A02();
            }
            this.A02 = true;
        }
        char c = 2;
        writer.write(123);
        writer.write("\"batches\":[");
        List list2 = this.A01;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C04950Qa r1 = (C04950Qa) list2.get(i2);
            if (c != 2) {
                writer.write(44);
            } else {
                c = 3;
            }
            if (!r1.BOB()) {
                r1.A02();
            }
            r1.A05(writer);
            writer.write(93);
            writer.write(125);
            writer.flush();
        }
        AnonymousClass0AT r3 = this.A00;
        writer.write("],");
        AnonymousClass0KD A022 = r3.A02.A02();
        try {
            AnonymousClass0AS r2 = r3.A01;
            AnonymousClass0KD A023 = A022.A01.A02();
            A022.A0D(A023, "request_info");
            r2.A00(A023);
            AnonymousClass0AR r32 = r3.A00;
            if (r32 != null) {
                AnonymousClass0KD A024 = A022.A01.A02();
                A022.A0D(A024, DexStore.CONFIG_FILENAME);
                SamplingPolicyConfig samplingPolicyConfig = r32.A00;
                samplingPolicyConfig.CXy(A024);
                samplingPolicyConfig.CYF(A024);
            }
            AnonymousClass0KR.A00().A05(A022, writer);
            A022.A02();
            writer.write(125);
        } catch (Throwable th) {
            A022.A02();
            throw th;
        }
    }

    public final void unlock() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C04950Qa) list.get(i)).unlock();
        }
        this.A02 = false;
    }

    public AnonymousClass0Qb(AnonymousClass0AT r3, List list) {
        if (!list.isEmpty()) {
            this.A01 = list;
            this.A00 = r3;
            return;
        }
        throw new IllegalArgumentException("payloads cannot be empty");
    }

    public final boolean BOB() {
        return this.A02;
    }
}
