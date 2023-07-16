package X;

import android.util.SparseArray;
import com.facebook.forker.Process;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6OQ  reason: invalid class name */
public final class AnonymousClass6OQ {
    public static final Object A00(AnonymousClass601 r23, C63893iY r24) {
        AnonymousClass601 r11 = r23;
        C63893iY r7 = r24;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r11);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        String A00 = C18170wI.A00(20);
        C127397h3 r4 = (C127397h3) A0B;
        int A0H = r4.A0H(38, Process.WAIT_RESULT_TIMEOUT);
        if (A0H != Integer.MIN_VALUE) {
            String A0C = C127397h3.A0C(r4);
            if (A0C != null) {
                SparseArray sparseArray = r4.A04;
                String A0m = C86114wI.A0m(sparseArray, 44);
                if (A0m != null) {
                    boolean A002 = AnonymousClass2LL.A00(C127397h3.A0A(r4, 41), false);
                    String A0o = C18230wP.A0o(r4);
                    if (A0o != null) {
                        String A0m2 = C86114wI.A0m(sparseArray, 43);
                        if (A0m2 != null) {
                            String A0m3 = C86114wI.A0m(sparseArray, 35);
                            if (A0m3 != null) {
                                List<Object> A0R = r4.A0R(42);
                                C04220Ms.A06(A0R);
                                ArrayList A0w = AnonymousClass0wJ.A0w(A0R);
                                for (Object valueOf : A0R) {
                                    A0w.add(String.valueOf(valueOf));
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo((String) null, A0C, A0m, A0o, A0m2, A0m3, (String) null, A0w, A0H, A002);
                                C127397h3 r6 = (C127397h3) C63893iY.A0C(r7, A00, A1Z ? 1 : 0);
                                C127397h3 A0K = r6.A0K(40);
                                if (A0K != null) {
                                    AnonymousClass7EW r16 = null;
                                    String A0O = r6.A0O(42, "");
                                    String A0o2 = C18230wP.A0o(r6);
                                    AnonymousClass7EW A003 = AnonymousClass7EW.A00(A0K);
                                    String A0m4 = C86114wI.A0m(r6.A04, 41);
                                    int A0H2 = r6.A0H(35, 0);
                                    C127397h3 A0K2 = r6.A0K(38);
                                    if (A0K2 != null) {
                                        r16 = AnonymousClass7EW.A00(A0K2);
                                    }
                                    AnonymousClass3LY.A00(C05030Qo.A02(C63913ic.A0F(r11))).CWx(new C131257rf(new AnonymousClass792(newFundraiserInfo, r16, A003, A0m4, (String) null, A0o2, (String) null, (String) null, A0O, A0H2)));
                                    return null;
                                }
                                throw C18190wL.A0a("Requires valid creator model");
                            }
                            throw C18190wL.A0a("Requires charity id");
                        }
                        throw C18190wL.A0a("Requires source name");
                    }
                    throw C18190wL.A0a("Requires description");
                }
                throw C18190wL.A0a("Requires title");
            }
            throw C18190wL.A0a("Requires goal currency");
        }
        throw C18190wL.A0a("Requires goal amount");
    }
}
