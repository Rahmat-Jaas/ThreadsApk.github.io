package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LA;
import X.C14030oh;
import X.C564637h;
import X.C63813iO;
import X.C689346a;
import X.C82394pY;
import X.C84134sb;

public final class BusinessLinkingInfoFragment$bizAccountInfoListener$1 implements C82394pY {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public BusinessLinkingInfoFragment$bizAccountInfoListener$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }

    public final void onEvent(C689346a r4) {
        String str;
        int A03 = C14030oh.A03(-511392315);
        C564637h r0 = (C564637h) ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)).A01.getValue()).AbO(this.this$0.callerInfo);
        if (r0 == null || (str = AnonymousClass00U.A0L("Event trigger received, new info: ", r0.A00)) == null) {
            str = "No Stored business name";
        }
        C63813iO.A0B(this.this$0.getContext(), str);
        C14030oh.A0A(-1740254393, A03);
    }

    public /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C14030oh.A03(-310846269);
        onEvent((C689346a) obj);
        C14030oh.A0A(-734544970, A03);
    }
}
