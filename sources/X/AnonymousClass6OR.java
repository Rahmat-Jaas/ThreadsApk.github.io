package X;

import android.util.SparseArray;
import com.facebook.forker.Process;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6OR  reason: invalid class name */
public final class AnonymousClass6OR {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        AnonymousClass601 r7 = r17;
        C63893iY r2 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r7);
        Object A0B = C63893iY.A0B(r2, 0);
        A0B.getClass();
        C127397h3 r8 = (C127397h3) A0B;
        C127397h3 r22 = (C127397h3) C63893iY.A0C(r2, C18170wI.A00(20), A1Z ? 1 : 0);
        int A0H = r8.A0H(38, Process.WAIT_RESULT_TIMEOUT);
        if (A0H != Integer.MIN_VALUE) {
            String A0C = C127397h3.A0C(r8);
            if (A0C != null) {
                SparseArray sparseArray = r8.A04;
                String A0m = C86114wI.A0m(sparseArray, 44);
                if (A0m != null) {
                    boolean A00 = AnonymousClass2LL.A00(C127397h3.A0A(r8, 41), false);
                    String A0m2 = C86114wI.A0m(sparseArray, 36);
                    if (A0m2 != null) {
                        String A0m3 = C86114wI.A0m(sparseArray, 43);
                        if (A0m3 != null) {
                            String A0m4 = C86114wI.A0m(sparseArray, 35);
                            if (A0m4 != null) {
                                List<Object> A0R = r8.A0R(42);
                                C04220Ms.A06(A0R);
                                ArrayList A0w = AnonymousClass0wJ.A0w(A0R);
                                for (Object valueOf : A0R) {
                                    A0w.add(String.valueOf(valueOf));
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo((String) null, A0C, A0m, A0m2, A0m3, A0m4, FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY.toString(), A0w, A0H, A00);
                                AnonymousClass3LY.A00(C05030Qo.A02(C63913ic.A0F(r7))).CWx(new C131367rq(new FundraiserDisplayInfoModel(C127397h3.A0F(r22, "", 36), C86114wI.A0m(r22.A04, 35), C127397h3.A0F(r22, "", 38), C127397h3.A0C(r22), C127397h3.A0F(r22, "", 41)), newFundraiserInfo));
                                return null;
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
