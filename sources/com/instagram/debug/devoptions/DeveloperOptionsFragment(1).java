package com.instagram.debug.devoptions;

import X.AnonymousClass06E;
import X.AnonymousClass0RA;
import X.AnonymousClass0hW;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C09860go;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C18250wR;
import X.C23411dm;
import X.C24;
import X.C38039KHq;
import X.C57593Br;
import X.C63273h9;
import X.C63613hu;
import X.C82034oy;
import X.C82394pY;
import X.C83874s8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeveloperOptionsFragment extends C23411dm implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final int DEBOUNCER_DELAY_MS = 500;
    public static final Class TAG = DeveloperOptionsFragment.class;
    public static final int TYPEAHEAD_POSITION = 0;
    public DevOptionsPreferenceAdapter adapter;
    public C38039KHq eventBus;
    public final C82394pY qeSyncEventListener = new DeveloperOptionsFragment$qeSyncEventListener$1(this);
    public UserSession session;
    public final AnonymousClass0hW settingSearchDebouncer = new AnonymousClass0hW(AnonymousClass0wJ.A0F(), new DeveloperOptionsFragment$settingSearchDebouncer$1(this), 500);
    public final C83874s8 typeAheadDelegate = new DeveloperOptionsFragment$typeAheadDelegate$1(this);
    public final C57593Br typeaheadHeaderModel = new C57593Br();

    public final class Companion {
        public final void collectDevOptionItems(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass06E r12, C23411dm r13, List list) {
            AnonymousClass0wJ.A1N(context, fragmentActivity);
            AnonymousClass0wJ.A1Q(userSession, r12);
            C18180wK.A1R(r13, list);
            collectDevOptionItems(context, fragmentActivity, userSession, r12, r13, list, DeveloperOptionsFragment$Companion$collectDevOptionItems$1.INSTANCE);
        }

        public static /* synthetic */ void collectDevOptionItems$default(Companion companion, Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass06E r5, C23411dm r6, List list, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded, int i, Object obj) {
            if ((i & 64) != 0) {
                onPinnedDevOptionItemAdded = DeveloperOptionsFragment$Companion$collectDevOptionItems$1.INSTANCE;
            }
            companion.collectDevOptionItems(context, fragmentActivity, userSession, r5, r6, list, onPinnedDevOptionItemAdded);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }

        public final void collectDevOptionItems(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass06E r10, C23411dm r11, List list, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1N(context, fragmentActivity);
            AnonymousClass0wJ.A1Q(userSession, r10);
            C18180wK.A1R(r11, list);
            C04220Ms.A0B(onPinnedDevOptionItemAdded, 6);
            PublicDeveloperOptions publicDeveloperOptions = PublicDeveloperOptions.INSTANCE;
            publicDeveloperOptions.addOptions(context, list, fragmentActivity, userSession, onPinnedDevOptionItemAdded);
            DevOptionsHelper.Companion.getInstance(userSession).storeItems(context, list);
        }
    }

    public static final void collectDevOptionItems(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass06E r4, C23411dm r5, List list) {
        Companion.collectDevOptionItems(context, fragmentActivity, userSession, r4, r5, list);
    }

    public static final void collectDevOptionItems(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass06E r4, C23411dm r5, List list, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion.collectDevOptionItems(context, fragmentActivity, userSession, r4, r5, list, onPinnedDevOptionItemAdded);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824983);
    }

    public String getModuleName() {
        return "developer_options";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0H = C18200wM.A0H(this);
        C04220Ms.A06(A0H);
        C18230wP.A0z(requireContext(), A0H, R.color.direct_widget_primary_background);
        setupTypeaheadHeaderModel();
        getScrollingViewProxy().A7b(new DeveloperOptionsFragment$onViewCreated$1(this));
        refreshItems();
        C24 scrollingViewProxy = getScrollingViewProxy();
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.adapter;
        if (devOptionsPreferenceAdapter == null) {
            C04220Ms.A0E("adapter");
            throw null;
        } else {
            scrollingViewProxy.ChZ(devOptionsPreferenceAdapter);
        }
    }

    public void setSession(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        this.session = userSession;
    }

    /* access modifiers changed from: private */
    public final void applyFilter(String str) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.adapter;
        if (devOptionsPreferenceAdapter == null) {
            C04220Ms.A0E("adapter");
            throw null;
        } else {
            devOptionsPreferenceAdapter.getFilter().filter(str);
        }
    }

    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    private final void setupTypeaheadHeaderModel() {
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search Developer Options");
        searchEditText.A0E = true;
        searchEditText.setAllowTextSelection(true);
        C57593Br r1 = this.typeaheadHeaderModel;
        r1.A00 = searchEditText;
        r1.A01 = this.typeAheadDelegate;
        r1.A02 = new DeveloperOptionsFragment$setupTypeaheadHeaderModel$1(this);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1982624039);
        super.onCreate(bundle);
        setSession(C18180wK.A0W(this, AnonymousClass0RA.A0C));
        this.eventBus = AnonymousClass3LY.A00(getSession());
        this.adapter = new DevOptionsPreferenceAdapter(requireActivity(), getSession(), this);
        C14030oh.A09(-954520426, A02);
    }

    public void onPause() {
        int A02 = C14030oh.A02(-97503980);
        super.onPause();
        C38039KHq kHq = this.eventBus;
        if (kHq == null) {
            C04220Ms.A0E("eventBus");
            throw null;
        }
        kHq.A02(this.qeSyncEventListener, DevOptionsRefreshEvent.class);
        if (this.mView != null) {
            C09860go.A0I(C18200wM.A0H(this));
        }
        C14030oh.A09(89019487, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(533253806);
        super.onResume();
        C38039KHq kHq = this.eventBus;
        if (kHq == null) {
            C04220Ms.A0E("eventBus");
            throw null;
        }
        kHq.A01(this.qeSyncEventListener, DevOptionsRefreshEvent.class);
        C14030oh.A09(-1051894552, A02);
    }

    public final void refreshItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SearchEditText searchEditText = this.typeaheadHeaderModel.A00;
        if (searchEditText != null) {
            searchEditText.setText("");
        }
        A0v.add(this.typeaheadHeaderModel);
        Companion.collectDevOptionItems(requireContext(), requireActivity(), getSession(), AnonymousClass06E.A00(this), this, A0v, new DeveloperOptionsFragment$refreshItems$1(this));
        List addPinnedDevOptions = PublicDeveloperOptions.INSTANCE.addPinnedDevOptions(this, getSession());
        if (!addPinnedDevOptions.isEmpty()) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            C63613hu.A03(A0v2, 2131825354);
            A0v2.addAll(addPinnedDevOptions);
            C63273h9.A02(A0v2);
            A0v.addAll(1, A0v2);
        }
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.adapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.setUnfilteredItems(A0v);
            DevOptionsPreferenceAdapter devOptionsPreferenceAdapter2 = this.adapter;
            if (devOptionsPreferenceAdapter2 != null) {
                devOptionsPreferenceAdapter2.getFilter().filter((CharSequence) null);
                return;
            }
        }
        C04220Ms.A0E("adapter");
        throw null;
    }
}
