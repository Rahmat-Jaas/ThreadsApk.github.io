package X;

import android.content.Context;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* renamed from: X.2Bj  reason: invalid class name */
public final class AnonymousClass2Bj {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        String str;
        Context context;
        String str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        C109326jp A06 = C63893iY.A06(r9, 0);
        String A0D = C63893iY.A0D(r9, A1Z ? 1 : 0);
        try {
            switch (A0D.hashCode()) {
                case 3134569:
                    str2 = "fb4a";
                    break;
                case 3228747:
                    if (A0D.equals("ig4a")) {
                        str = "894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com";
                        break;
                    }
                    break;
                case 3354638:
                    str2 = "mn4a";
                    break;
                case 1646515095:
                    if (A0D.equals("fblite4a")) {
                        str = "37858054444-61gu2sctvhvn7tphd98vjuilkbq2aqvf.apps.googleusercontent.com";
                        break;
                    }
                    break;
            }
            if (A0D.equals(str2)) {
                str = "15057814354-80cg059cn49j6kmhhkjam4b00on1gb2n.apps.googleusercontent.com";
                AnonymousClass3HX r0 = r8.A00;
                if (r0 == null || (context = r0.A00) == null) {
                    C63893iY.A0F(r8, AnonymousClass3VO.A00(), A06, AnonymousClass4To.A00(), 0);
                    return null;
                }
                IDxFCallbackShape113S0200000_1_I2 iDxFCallbackShape113S0200000_1_I2 = new IDxFCallbackShape113S0200000_1_I2(0, A06, r8);
                C86004w7 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
                ListenableFuture CwQ = listeningDecorator.CwQ(new AnonymousClass4Tr(context, str));
                listeningDecorator.shutdown();
                C04220Ms.A06(CwQ);
                C30954Gc6.A03(iDxFCallbackShape113S0200000_1_I2, CwQ, context.getMainExecutor());
                return null;
            }
            throw new AnonymousClass2AW(AnonymousClass00U.A0V("This app:", A0D, AnonymousClass000.A00(17)));
        } catch (AnonymousClass2AW unused) {
            C63893iY.A0F(r8, AnonymousClass3VO.A00(), A06, AnonymousClass4To.A00(), 0);
            return null;
        }
    }
}
