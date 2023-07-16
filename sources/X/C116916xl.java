package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6xl  reason: invalid class name and case insensitive filesystem */
public final class C116916xl {
    public static C113646ru A00(ImmutableList immutableList, Integer num, String str, String str2, int i, int i2) {
        C113646ru r0;
        switch (num.intValue()) {
            case 0:
                r0 = new C92175hk();
                break;
            case 1:
                r0 = new C92165hj();
                break;
            case 2:
                r0 = new C92155hi();
                break;
            case 3:
                r0 = new C92185hl();
                break;
            case 4:
                r0 = new C92135hg();
                break;
            case 5:
                r0 = new C40102LNn();
                break;
            case 6:
                r0 = new C92125hf();
                break;
            case 7:
                r0 = new C92115he();
                break;
            case 8:
                r0 = new C92145hh(immutableList);
                break;
            case 9:
                r0 = new C92195hm();
                break;
            default:
                throw C18180wK.A0a(AnonymousClass00U.A0L(C18170wI.A00(StringTreeSet.MAX_SYMBOL_COUNT), A01(num)));
        }
        r0.A02 = str2;
        r0.A01 = i;
        r0.A00 = i2;
        r0.A00(str);
        return r0;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MAX_LENGTH";
            case 2:
                return "EXACT_LENGTH";
            case 3:
                return "REGEX";
            case 4:
                return "EMPTY";
            case 5:
                return "US_STATE";
            case 6:
                return "DATE";
            case 7:
                return "CARD";
            case 8:
                return "CARD_TYPE";
            case 9:
                return "PHONE";
            default:
                return "MIN_LENGTH";
        }
    }
}
