package X;

import android.net.Uri;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.regex.Matcher;

/* renamed from: X.7Bt  reason: invalid class name and case insensitive filesystem */
public final class C120617Bt {
    public static final void A00(C147188nY r29, C134727yF r30, C120617Bt r31, int i) {
        int i2;
        C147188nY r7 = r29;
        r7.Cvd(-971191220);
        int i3 = i;
        C134727yF r5 = r30;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, r5) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r7.BCM()) {
            Matcher A01 = AnonymousClass73Y.A01(r5.A01().A00);
            C04220Ms.A06(A01);
            while (A01.find()) {
                r7.Cvb(-1091996356);
                String group = A01.group(1);
                if (group != null) {
                    String A0n = C18190wL.A0n(C18220wO.A0F(new Uri.Builder().authority("hashtag"), "id", AnonymousClass8bQ.A0l(C86114wI.A0o(group), "#", "", false)));
                    int start = A01.start(1);
                    int end = A01.end(1);
                    r5.A05(new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, (C134817yQ) null, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16382, C120537Bh.A00(r7).A0R, 0, 0, 0), start, end);
                    C39237Kq4 kq4 = C36975Ji8.A03;
                    r5.A09("InlineLinkUrn", C18210wN.A0d(InlineLinkUrn.class, new InlineLinkUrn(group, A0n), kq4, kq4.A02), start, end);
                }
                AnonymousClass7W3.A0y(r7);
            }
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r5, r31, i3, 36);
        }
    }

    public static final void A01(C147188nY r29, C134727yF r30, C120617Bt r31, int i) {
        int i2;
        C147188nY r7 = r29;
        r7.Cvd(446994030);
        int i3 = i;
        C134727yF r5 = r30;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r7, r5) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r7.BCM()) {
            Matcher matcher = AnonymousClass0hA.A02.matcher(r5.A01().A00);
            while (matcher.find()) {
                r7.Cvb(861419440);
                String group = matcher.group(1);
                if (group != null) {
                    String A0n = C18190wL.A0n(C18220wO.A0F(new Uri.Builder().authority("mention"), "id", AnonymousClass8bQ.A0l(C86114wI.A0o(group), "@", "", false)));
                    int start = matcher.start(1);
                    int end = matcher.end(1);
                    r5.A05(new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, (C134817yQ) null, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16382, C120537Bh.A00(r7).A0R, 0, 0, 0), start, end);
                    C39237Kq4 kq4 = C36975Ji8.A03;
                    r5.A09("InlineLinkUrn", C18210wN.A0d(InlineLinkUrn.class, new InlineLinkUrn(group, A0n), kq4, kq4.A02), start, end);
                }
                AnonymousClass7W3.A0y(r7);
            }
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A05(AKE, r5, r31, i3, 37);
        }
    }
}
