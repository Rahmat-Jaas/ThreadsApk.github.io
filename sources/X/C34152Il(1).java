package X;

import com.instagram.barcelona.R;

/* renamed from: X.2Il  reason: invalid class name and case insensitive filesystem */
public final class C34152Il {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        Integer num;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        AnonymousClass3HX A0D = C63913ic.A0D(r8);
        String A0o = C18220wO.A0o(C101046Pr.A00(A0D, r8, ((C121997Jj) C63893iY.A0B(r9, 0)).A02));
        if (A0o != null) {
            Integer[] A1Z2 = C18240wQ.A1Z();
            int length = A1Z2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    num = A1Z2[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "skip_step";
                            break;
                        case 2:
                            str = "revisit_step";
                            break;
                        default:
                            str = "mark_step_complete";
                            break;
                    }
                    if (!C04220Ms.A0I(str, A0o)) {
                        i++;
                    }
                } else {
                    num = null;
                }
            }
        } else {
            num = null;
        }
        C84124sa r2 = (C84124sa) A0D.A01.get(R.id.safety_step_handler);
        if (!(r2 == null || num == null)) {
            int intValue = num.intValue();
            if (intValue == 0) {
                r2.C5u();
                return null;
            } else if (intValue == A1Z) {
                r2.CLA();
                return null;
            } else if (intValue == 2) {
                r2.CHW();
            }
        }
        return null;
    }
}
