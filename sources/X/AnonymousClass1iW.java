package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1iW  reason: invalid class name */
public final class AnonymousClass1iW extends C63873iU {
    public List A00;
    public List A01;
    public final /* synthetic */ AnonymousClass1cN A02;

    public AnonymousClass1iW(AnonymousClass1cN r1, List list, List list2) {
        this.A02 = r1;
        this.A01 = list;
        this.A00 = list2;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A03 = C14030oh.A03(391923452);
        AnonymousClass1cN r4 = this.A02;
        C63813iO.A03(r4.getContext(), "UserListStatusCallback_request_error", 2131834837, 1);
        C57273Ak A002 = AnonymousClass2TB.A00(r4.A04);
        A002.A01.flowEndFail(A002.A00, "error", (String) null);
        C14030oh.A0A(-1199011357, A03);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A03 = C14030oh.A03(-1368438641);
        AnonymousClass1cN r2 = this.A02;
        AnonymousClass3LY.A00(r2.A04).CWx(new AnonymousClass46M((List) null));
        C57273Ak A002 = AnonymousClass2TB.A00(r2.A04);
        A002.A01.flowEndFail(A002.A00, "error", (String) null);
        C14030oh.A0A(-1015619277, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-2004246492);
        super.onFinish();
        C18190wL.A1B(this.A02);
        C14030oh.A0A(151467355, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1889906404);
        int A032 = C14030oh.A03(401982943);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C18210wN.A0P(this.A02.A04, C18180wK.A0k(it)).A2I(true);
        }
        Iterator it2 = this.A00.iterator();
        while (it2.hasNext()) {
            C18210wN.A0P(this.A02.A04, C18180wK.A0k(it2)).A2I(false);
        }
        AnonymousClass1cN r1 = this.A02;
        r1.requireActivity().getFragmentManager().popBackStack();
        C57273Ak A002 = AnonymousClass2TB.A00(r1.A04);
        A002.A01.flowEndSuccess(A002.A00);
        C14030oh.A0A(827159979, A032);
        C14030oh.A0A(1993100191, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C14030oh.A03(-1717775121);
        int A032 = C14030oh.A03(-542918053);
        AnonymousClass1cN r6 = this.A02;
        C38039KHq A002 = AnonymousClass3LY.A00(r6.A04);
        AnonymousClass1fU r0 = r6.A02;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = r0.A05.iterator();
        while (it.hasNext()) {
            C18190wL.A1T(A0v, it);
        }
        A002.CWx(new AnonymousClass46M(A0v));
        AnonymousClass3LY.A00(r6.A04).CWx(new C688945w());
        C57273Ak A003 = AnonymousClass2TB.A00(r6.A04);
        A003.A01.flowEndSuccess(A003.A00);
        C14030oh.A0A(-472233782, A032);
        C14030oh.A0A(-1504023614, A03);
    }
}
