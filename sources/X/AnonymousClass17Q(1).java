package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.17Q  reason: invalid class name */
public final class AnonymousClass17Q extends AnonymousClass0Sf {
    public static final AnonymousClass3DZ A07 = new AnonymousClass3DZ();
    public final int A00;
    public final C109326jp A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass17Q() {
        this((C109326jp) null, (Integer) null, (String) null, "regular", (String) null, 0, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17Q) {
                AnonymousClass17Q r5 = (AnonymousClass17Q) obj;
                if (this.A02 != r5.A02 || !C04220Ms.A0I(this.A05, r5.A05) || this.A06 != r5.A06 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "MORE_HORIZONTAL_PANO";
                    break;
                case 2:
                    str = "NEXT";
                    break;
                case 3:
                    str = "SHARE";
                    break;
                case 4:
                    str = "INFO";
                    break;
                case 5:
                    str = "INSIGHTS";
                    break;
                case 6:
                    str = "DELETE";
                    break;
                case 7:
                    str = "CONVERT_TO_BUSINESS";
                    break;
                case 8:
                    str = "DONE";
                    break;
                case 9:
                    str = "ADD";
                    break;
                case 10:
                    str = "COMPOSE";
                    break;
                case 11:
                    str = "CAMERA";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = I17.A00(366);
                    break;
                case 13:
                    str = "SAVE";
                    break;
                case 14:
                    str = "UNSAVE";
                    break;
                case 15:
                    str = "VIDEO_CALL";
                    break;
                case 16:
                    str = "AUDIO_CALL";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str = "CANCEL";
                    break;
                case 18:
                    str = "MULTI_SELECT_ICON";
                    break;
                case 19:
                    str = "BACK";
                    break;
                case 20:
                    str = "REFRESH";
                    break;
                case 21:
                    str = "REPORT";
                    break;
                case 22:
                    str = "ROOMS";
                    break;
                case 23:
                    str = "OVERFLOW_HORIZONTAL";
                    break;
                case 24:
                    str = "CART";
                    break;
                case 25:
                    str = "SETTINGS";
                    break;
                case Rfc3492Idn.tmax /*26*/:
                    str = "MAIL";
                    break;
                case 27:
                    str = "SLIDERS";
                    break;
                case 28:
                    str = "PAYMENTS";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str = "QUESTIONS";
                    break;
                case 30:
                    str = "EDIT_LIST";
                    break;
                default:
                    str = "OVERFLOW";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int A062 = ((hashCode * 31) + AnonymousClass0wJ.A06(this.A05)) * 31;
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return ((((((((A062 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A07(this.A01)) * 31) + this.A00;
    }

    public AnonymousClass17Q(C109326jp r1, Integer num, String str, String str2, String str3, int i, boolean z) {
        this.A02 = num;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = r1;
        this.A00 = i;
    }
}
