package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.4Db  reason: invalid class name */
public final class AnonymousClass4Db implements C39690KyC {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C23411dm A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AnonymousClass1wA A03;

    public AnonymousClass4Db(AnonymousClass1wA r1, UserSession userSession, C23411dm r3, List list) {
        this.A03 = r1;
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = list;
    }

    public final void onFailure(String str) {
        C23411dm r1 = this.A01;
        if (r1.getContext() != null) {
            C63813iO.A0A(r1.getContext(), 2131825166, 1);
        }
        this.A03.setBottomSheetMenuItems(this.A02);
    }

    public final void onSuccess() {
        try {
            DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) C18230wP.A0g(DeveloperOptionsLauncher.DEV_OPTIONS_PLUGIN_IMPL);
            UserSession userSession = this.A00;
            C23411dm r1 = this.A01;
            AnonymousClass4B1 r0 = new AnonymousClass4B1(this);
            AnonymousClass0wJ.A1N(userSession, r1);
            List pinnedDevOptions = PinnedDeveloperOptionsUtil.getPinnedDevOptions(userSession, r1, r0);
            if (!pinnedDevOptions.isEmpty()) {
                List list = this.A02;
                C63273h9.A03(list);
                C63613hu.A02("Pinned Rageshake Items", list);
                list.addAll(pinnedDevOptions);
            }
            AnonymousClass1wA r3 = this.A03;
            FragmentActivity activity = r3.getActivity();
            if (!(activity == null || activity.findViewById(R.id.thread_fragment_container) == null)) {
                List list2 = this.A02;
                C63273h9.A03(list2);
                C63613hu.A02("IG Direct", list2);
                list2.add(AnonymousClass4MA.A00(C18190wL.A0H(this, 106), 2131834011));
            }
            r3.setBottomSheetMenuItems(this.A02);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
