package X;

import java.util.List;

/* renamed from: X.1hk  reason: invalid class name and case insensitive filesystem */
public final class C24241hk extends C63873iU {
    public final String A00;
    public final /* synthetic */ C61643Ur A01;

    public C24241hk(C61643Ur r2, String str) {
        C04220Ms.A0B(str, 2);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r5) {
        String errorMessage;
        int A002 = AnonymousClass0wJ.A00(-370896393, r5);
        AnonymousClass1j3 r0 = (AnonymousClass1j3) r5.A00;
        if (r0 == null || (errorMessage = r0.getErrorMessage()) == null) {
            C61643Ur r02 = this.A01;
            r02.A02.CSf(AnonymousClass0wJ.A0k(r02.A01, 2131831662), AnonymousClass006.A00);
        } else {
            this.A01.A02.CSf(errorMessage, AnonymousClass006.A01);
        }
        C14030oh.A0A(-827393270, A002);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-149660278);
        this.A01.A02.CSg();
        C14030oh.A0A(119458024, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        AnonymousClass3FW r0;
        int i;
        int A03 = C14030oh.A03(1053578685);
        AnonymousClass1TR r6 = (AnonymousClass1TR) obj;
        int A002 = AnonymousClass0wJ.A00(-1603670531, r6);
        String str = this.A00;
        C61643Ur r1 = this.A01;
        if (!C04220Ms.A0I(str, r1.A03.invoke())) {
            i = 1278534716;
        } else {
            if (r6.A02) {
                r1.A02.CSe();
            } else {
                C84364t1 r2 = r1.A02;
                String str2 = r6.A01;
                C04220Ms.A06(str2);
                AnonymousClass1T7 r02 = r6.A00;
                if (r02 == null || (r0 = r02.A00) == null) {
                    list = null;
                } else {
                    list = r0.A00();
                }
                r2.CSh(str2, list);
            }
            i = -801855756;
        }
        C14030oh.A0A(i, A002);
        C14030oh.A0A(1368940860, A03);
    }
}
