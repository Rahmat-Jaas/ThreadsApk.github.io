package X;

import com.facebook.analytics2.logger.DefaultFalcoAcsProvider;
import java.io.File;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.0By  reason: invalid class name and case insensitive filesystem */
public final class C02570By {
    public String A00;
    public final int A01;
    public final File A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public final Object A00(C02560Bx r3) {
        r3.putString("uploader_class", this.A0A);
        r3.putString("flexible_sampling_updater", this.A07);
        r3.putString("privacy_policy", this.A06);
        r3.putString("thread_handler_factory", this.A08);
        r3.putString("upload_job_instrumentation", this.A09);
        r3.putString("priority_dir", this.A02.getAbsolutePath());
        r3.putInt("network_priority", this.A03.intValue());
        r3.putString("marauder_tier", this.A05);
        r3.putInt("multi_batch_payload_size", this.A01);
        r3.putInt("non_sticky_handling", this.A0B ? 1 : 0);
        r3.putString("batch_payload_iterator_factory", this.A04);
        r3.putString("acs_provider", this.A00);
        return r3.CwG();
    }

    public C02570By(C02550Bw r13) {
        String string = r13.getString("uploader_class", (String) null);
        if (string != null) {
            String string2 = r13.getString("flexible_sampling_updater", (String) null);
            String string3 = r13.getString("acs_provider", (String) null);
            String string4 = r13.getString("privacy_policy", (String) null);
            String string5 = r13.getString("thread_handler_factory", (String) null);
            String string6 = r13.getString("upload_job_instrumentation", (String) null);
            String string7 = r13.getString("priority_dir", (String) null);
            if (string7 != null) {
                int i = r13.getInt("network_priority", 0);
                String string8 = r13.getString("marauder_tier", (String) null);
                if (string8 != null) {
                    int i2 = r13.getInt("multi_batch_payload_size", HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
                    this.A0A = string;
                    this.A07 = string2;
                    this.A06 = string4;
                    this.A08 = string5;
                    this.A09 = string6;
                    this.A02 = new File(string7);
                    this.A03 = AnonymousClass006.A00(2)[i];
                    this.A05 = string8;
                    this.A01 = i2;
                    this.A0B = r13.getInt("non_sticky_handling", 0) == 1;
                    this.A04 = r13.getString("batch_payload_iterator_factory", (String) null);
                    this.A00 = string3;
                    return;
                }
                throw new AnonymousClass0BI("marauder_tier is null or empty");
            }
            throw new AnonymousClass0BI("priority_dir is null or empty");
        }
        throw new AnonymousClass0BI("uploader_class is null or empty");
    }

    public C02570By(C02190Ae r3, File file, int i) {
        String str;
        Class cls = r3.A01;
        this.A00 = DefaultFalcoAcsProvider.class.getName();
        this.A0A = cls.getName();
        Class cls2 = r3.A00;
        if (cls2 != null) {
            str = cls2.getName();
        } else {
            str = null;
        }
        this.A07 = str;
        this.A06 = null;
        this.A08 = r3.A02.getName();
        this.A09 = null;
        this.A02 = file;
        this.A03 = r3.A03;
        String str2 = r3.A04;
        if (str2 != null) {
            this.A05 = str2;
            this.A01 = i;
            this.A0B = false;
            this.A04 = null;
            return;
        }
        throw new IllegalArgumentException("marauderTier required");
    }
}
