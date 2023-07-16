package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Da  reason: invalid class name and case insensitive filesystem */
public final class C70194Da implements C39690KyC {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;

    public C70194Da(FragmentActivity fragmentActivity, UserSession userSession, Context context) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = context;
    }

    public final void onFailure(String str) {
        C63813iO.A03(this.A00, (String) null, 2131836068, 1);
    }

    public final void onSuccess() {
        FragmentActivity fragmentActivity = this.A01;
        Object A0g = C18230wP.A0g("com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl");
        C04220Ms.A0C(A0g, "null cannot be cast to non-null type com.instagram.dogfoodingassistant.intf.DogfoodingAssistantPlugin");
        DogfoodingAssistantPluginImpl dogfoodingAssistantPluginImpl = (DogfoodingAssistantPluginImpl) A0g;
        C04220Ms.A0B(dogfoodingAssistantPluginImpl, 0);
        DogfoodingAssistantPluginImpl.A00 = dogfoodingAssistantPluginImpl;
        Bundle A06 = C18180wK.A06();
        A06.putString("bottom_sheet_content_fragment", "dogfood_assistant");
        A06.putString("bottom_sheet_title", fragmentActivity.getString(2131825637));
        A06.putString("dogfooding_assistant_surface", "discovery");
        C63863iT.A0B(fragmentActivity, A06, TransparentBackgroundModalActivity.class, "bottom_sheet");
    }
}
