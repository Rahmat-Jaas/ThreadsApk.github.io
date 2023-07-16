package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2SF  reason: invalid class name */
public final class AnonymousClass2SF {
    public static final void A00(C13330nS r2, Integer num, Integer num2, String str, String str2, String str3) {
        String str4;
        String str5;
        C04220Ms.A0B(str2, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2, "ig_original_pdq"), 1398);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0S("media_id", AnonymousClass0wJ.A0d(str));
            A0I.A0S("owner_id", AnonymousClass0wJ.A0d(str2));
            switch (num.intValue()) {
                case 0:
                    str4 = "original_hash_start";
                    break;
                case 1:
                    str4 = "original_hash_cancelled";
                    break;
                case 2:
                    str4 = "original_hash_pdq_cancelled";
                    break;
                case 3:
                    str4 = "original_hash_md5_cancelled";
                    break;
                case 4:
                    str4 = "original_hash_skipped";
                    break;
                case 5:
                    str4 = "original_hash_pdq_scheduled";
                    break;
                case 6:
                    str4 = "original_hash_md5_scheduled";
                    break;
                case 7:
                    str4 = "original_hash_pdq_generated";
                    break;
                case 8:
                    str4 = "original_hash_md5_generated";
                    break;
                case 9:
                    str4 = "original_hash_md5_partial_generated";
                    break;
                default:
                    str4 = "original_hash_sent";
                    break;
            }
            C18190wL.A1I(A0I, str4);
            if (num2.intValue() != 0) {
                str5 = "ig_android_video";
            } else {
                str5 = "ig_android_image";
            }
            A0I.A0T("upload_location", str5);
            A0I.A1J(str3);
            A0I.Bb4();
        }
    }
}
