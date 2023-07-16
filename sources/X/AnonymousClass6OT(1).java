package X;

import com.facebook.forker.Process;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.6OT  reason: invalid class name */
public final class AnonymousClass6OT {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        C127397h3 A03 = C63893iY.A03(r11, A1Z ? 1 : 0);
        String A0o = C18230wP.A0o(A03);
        if (A0o != null) {
            String A0o2 = C18220wO.A0o(A03);
            if (A0o2 != null) {
                int A0H = A03.A0H(38, Process.WAIT_RESULT_TIMEOUT);
                if (A0H != Integer.MIN_VALUE) {
                    String A0C = C127397h3.A0C(A03);
                    if (A0C != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        C04220Ms.A06(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0C));
                        String format = currencyInstance.format(Integer.valueOf(A0H));
                        C04220Ms.A06(format);
                        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = new ExistingStandaloneFundraiserForFeedModel(A0o, A0o2, format, (String) null);
                        C109546kB r5 = new C109546kB(C63913ic.A05(r10), C05030Qo.A02(C63913ic.A0F(r10)));
                        C170769vX r4 = C170769vX.STANDALONE_FUNDRAISER;
                        C84584tU A02 = C25529DnJ.A02.A02(r5.A00, (C33745Htj) r5.A02.getValue(), r5.A01);
                        C28923FeI feI = C28923FeI.FOLLOWERS_SHARE;
                        C25818DsX dsX = new C25818DsX(feI);
                        dsX.A03 = A1Z;
                        dsX.A05 = false;
                        A02.Cv0(r4, new MediaCaptureConfig(dsX), feI);
                        C31025Gdk.A01().A0A = existingStandaloneFundraiserForFeedModel;
                        return null;
                    }
                    throw C18190wL.A0a("Requires goal currency");
                }
                throw C18190wL.A0a("Requires goal amount");
            }
            throw C18190wL.A0a("Requires beneficiary short name");
        }
        throw C18190wL.A0a("Requires fundraiser id");
    }
}
