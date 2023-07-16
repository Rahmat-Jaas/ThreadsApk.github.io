package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import java.util.List;

/* renamed from: X.08M  reason: invalid class name */
public final class AnonymousClass08M implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C05010Qj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass08M(C05010Qj r1, String str, String str2, String str3, long j) {
        this.A01 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = j;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A01.A00;
        if (multiSignalANRDetector.A0H) {
            C06870aW r8 = multiSignalANRDetector.A0V.A03;
            String str = this.A03;
            String str2 = this.A02;
            String str3 = this.A04;
            long j = this.A00;
            List list = r8.A0U;
            if (list.size() < 5) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
                sb.append(j);
                sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
                sb.append(str2);
                sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
                sb.append(str3);
                list.add(sb.toString());
                C06870aW.A00(r8);
            }
        }
    }
}
