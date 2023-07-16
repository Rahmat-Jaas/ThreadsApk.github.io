package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.EditBusinessFBPageFragment;
import java.util.List;

/* renamed from: X.1ex  reason: invalid class name and case insensitive filesystem */
public final class C23661ex extends AnonymousClass1ig {
    public final /* synthetic */ EditBusinessFBPageFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23661ex(Context context, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, EditBusinessFBPageFragment editBusinessFBPageFragment, AnonymousClass3IK r14, C10300i6 r15, String str) {
        super(context, businessFlowAnalyticsLogger, (C84654td) null, r14, r15, str, "page_change", (String) null, (String) null);
        this.A00 = editBusinessFBPageFragment;
    }

    public final void A01(C24481is r9) {
        C556934f r0;
        C556834e r02;
        List list;
        String str;
        int A03 = C14030oh.A03(684784387);
        super.A01(r9);
        EditBusinessFBPageFragment editBusinessFBPageFragment = this.A00;
        C50242sg.A00(editBusinessFBPageFragment.mView, false);
        if (r9 == null || (r0 = r9.A00) == null || (r02 = r0.A00) == null || (list = r02.A00) == null || list.isEmpty()) {
            EditBusinessFBPageFragment.A04(editBusinessFBPageFragment, (String) null);
            editBusinessFBPageFragment.A00.setVisibility(8);
        } else {
            List list2 = r9.A00.A00.A00;
            AnonymousClass1fO r3 = editBusinessFBPageFragment.A03;
            ImmutableList A002 = AnonymousClass2KB.A00(list2);
            List list3 = r3.A05;
            list3.clear();
            list3.addAll(A002);
            if (!A002.isEmpty()) {
                r3.A04.Crt((AnonymousClass3IK) list3.get(0));
                AnonymousClass1fO.A00(r3);
            }
            AnonymousClass3IK r03 = editBusinessFBPageFragment.A05;
            if (r03 == null) {
                str = null;
            } else {
                str = r03.A08;
            }
            EditBusinessFBPageFragment.A04(editBusinessFBPageFragment, str);
        }
        editBusinessFBPageFragment.A0B = false;
        editBusinessFBPageFragment.A01.setVisibility(8);
        C14030oh.A0A(1661696688, A03);
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(-485964357);
        super.onFail(r6);
        EditBusinessFBPageFragment editBusinessFBPageFragment = this.A00;
        C63813iO.A01(editBusinessFBPageFragment.getContext(), editBusinessFBPageFragment.getString(2131826864));
        C50242sg.A00(editBusinessFBPageFragment.mView, false);
        AnonymousClass1fO r1 = editBusinessFBPageFragment.A03;
        r1.A05.clear();
        AnonymousClass1fO.A00(r1);
        editBusinessFBPageFragment.A01.setVisibility(0);
        C14030oh.A0A(337001744, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-102780039);
        A01((C24481is) obj);
        C14030oh.A0A(-530688103, A03);
    }
}
