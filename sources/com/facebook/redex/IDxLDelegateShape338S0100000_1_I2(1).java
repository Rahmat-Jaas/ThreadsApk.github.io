package com.facebook.redex;

import X.AnonymousClass1dK;
import X.AnonymousClass3J5;
import X.C146958n9;
import X.C18200wM;
import X.C18240wQ;
import X.C195610i;
import X.C21269Brb;
import X.C23441dq;
import X.C23451ds;
import X.C23481dv;
import X.C23511dy;
import X.C25237DiI;
import X.C25971pk;
import X.C27952Ew2;
import X.C62793ak;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl;

public class IDxLDelegateShape338S0100000_1_I2 implements C21269Brb {
    public Object A00;
    public final int A01;

    public IDxLDelegateShape338S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void AA0() {
        String str;
        switch (this.A01) {
            case 0:
                C23511dy r1 = (C23511dy) this.A00;
                ((C25971pk) r1.A0L.getValue()).A03(false, r1.A04);
                return;
            case 1:
                ((C195610i) ((C23441dq) this.A00).A03.getValue()).Bas();
                return;
            case 2:
                FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) ((C23481dv) this.A00).A02.getValue();
                fanClubMemberListViewModel.A04.A02((String) fanClubMemberListViewModel.A0E.getValue());
                return;
            case 3:
                C62793ak A0N = C18200wM.A0N(((C23451ds) this.A00).A02);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 33), AnonymousClass3J5.A00(A0N), 3);
                return;
            default:
                AnonymousClass1dK r3 = (AnonymousClass1dK) this.A00;
                CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.PageInfo pageInfo = r3.A03;
                if (pageInfo != null && pageInfo.getBooleanValue("has_next_page")) {
                    CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.PageInfo pageInfo2 = r3.A03;
                    if (pageInfo2 != null) {
                        str = pageInfo2.getStringValue("end_cursor");
                    } else {
                        str = null;
                    }
                    AnonymousClass1dK.A00(r3, str);
                    return;
                }
                return;
        }
    }
}
