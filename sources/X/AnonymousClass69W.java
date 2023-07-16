package X;

import com.instagram.barcelona.R;
import java.util.regex.Pattern;

/* renamed from: X.69W  reason: invalid class name */
public enum AnonymousClass69W {
    AMERICAN_EXPRESS("amex", "^3[47]\\d*", "4", 0, 15, 15),
    DISCOVER("disc", "^(6011|65|64[4-9]|622)\\d*", "3", 1, 16, 16),
    JCB("jcb", "^35\\d*", "3", 2, 16, 16),
    MASTERCARD("mastercard", "^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[0-1]|2720)\\d*", "3", 3, 16, 16),
    RUPAY("rupay", "^(508[5-9]|6521[5-9]|652[2-9]|6530|6531[0-4]|60[6-8])\\d*", "3", 4, 16, 16),
    VISA("visa", "^4\\d*", "3", 5, 16, 16),
    UNKNOWN("unknown", "\\d+", r23, 10, 16, 16),
    EMPTY("", "^$", r23, 11, 16, 16);
    
    public static final int[] A06 = null;
    public static final int[] A07 = null;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Pattern A05;

    /* access modifiers changed from: public */
    static {
        A06 = new int[]{4, 10};
        A07 = new int[]{4, 8, 12};
    }

    public static AnonymousClass69W A01(String str) {
        if (str != null) {
            String replaceAll = str.replaceAll("[^a-zA-Z]", "");
            for (AnonymousClass69W r7 : values()) {
                if (r7.name().replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(replaceAll)) {
                    return r7;
                }
            }
        }
        return UNKNOWN;
    }

    /* access modifiers changed from: public */
    AnonymousClass69W(String str, String str2, String str3, int i, int i2, int i3) {
        this.A03 = r3;
        this.A02 = str;
        this.A05 = Pattern.compile(str2);
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = str3;
    }

    public static AnonymousClass69W A00(String str) {
        AnonymousClass69W r2;
        AnonymousClass69W[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = EMPTY;
                break;
            }
            r2 = values[i];
            if (C18240wQ.A1V(str, r2.A05)) {
                break;
            }
            i++;
        }
        AnonymousClass69W r1 = EMPTY;
        if (r2 != r1 && r2 != UNKNOWN) {
            return r2;
        }
        if (!str.isEmpty()) {
            return UNKNOWN;
        }
        return r1;
    }

    public final int A02() {
        switch (ordinal()) {
            case 0:
                return R.drawable.payment_amex_40;
            case 1:
                return R.drawable.payment_discover_40;
            case 2:
                return R.drawable.payment_jcb_40;
            case 3:
                return R.drawable.payment_mastercard_40;
            case 5:
                return R.drawable.payment_visa_40;
            case 6:
                return R.drawable.payment_diners_club_40;
            default:
                return R.drawable.payment_generic_card_icon;
        }
    }
}
