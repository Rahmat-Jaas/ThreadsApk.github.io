package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CallToAction;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vw  reason: invalid class name and case insensitive filesystem */
public final class C133587vw implements C39777Kzl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ CallToAction A01;
    public final /* synthetic */ UserSession A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public C133587vw(FragmentActivity fragmentActivity, CallToAction callToAction, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = callToAction;
        this.A00 = fragmentActivity;
    }

    public final void onButtonClick(View view) {
        C25039DeW A0U = C86144wL.A0U();
        AnonymousClass0wJ.A19(A0U.A06(new LeadGenBaseFormList(this.A01, (ImageUrl) null, (LeadForm) null, (String) null, "", "", AnonymousClass0wJ.A0v(), false), AnonymousClass000.A00(177)), this.A00, this.A02);
    }
}
