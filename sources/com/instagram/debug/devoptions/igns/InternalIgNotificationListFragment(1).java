package com.instagram.debug.devoptions.igns;

import X.AnonymousClass006;
import X.AnonymousClass0OY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.AnonymousClass7Dm;
import X.AnonymousClass9NU;
import X.C04220Ms;
import X.C04530Oa;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InternalIgNotificationListFragment extends AnonymousClass9NU implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final String MODULE_NAME = "internal_notification_list_fragment";
    public final InternalIgNotificationListFragment$notificationDebugDefinitionDelegate$1 notificationDebugDefinitionDelegate = new InternalIgNotificationListFragment$notificationDebugDefinitionDelegate$1(this);
    public final C04530Oa userSession$delegate = new AnonymousClass4UR(new InternalIgNotificationListFragment$userSession$2(this));
    public final C04530Oa viewModel$delegate;

    public String getModuleName() {
        return MODULE_NAME;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getViewModel().notifications.A0C(getViewLifecycleOwner(), new InternalIgNotificationListFragment$onViewCreated$1(this));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final InternalIgNotificationListViewModel getViewModel() {
        return (InternalIgNotificationListViewModel) this.viewModel$delegate.getValue();
    }

    public Collection getDefinitions() {
        return C18180wK.A0n(new InternalIgNotificationRowDefinition(this.notificationDebugDefinitionDelegate));
    }

    public AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(InternalIgNotificationListFragment$getRecyclerConfigBuilder$1.INSTANCE);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public InternalIgNotificationListFragment() {
        InternalIgNotificationListFragment$viewModel$2 internalIgNotificationListFragment$viewModel$2 = new InternalIgNotificationListFragment$viewModel$2(this);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new InternalIgNotificationListFragment$special$$inlined$viewModels$default$2(new InternalIgNotificationListFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = C18220wO.A0M(new InternalIgNotificationListFragment$special$$inlined$viewModels$default$3(A01), internalIgNotificationListFragment$viewModel$2, new InternalIgNotificationListFragment$special$$inlined$viewModels$default$4((AnonymousClass0ZU) null, A01), C18210wN.A0l(InternalIgNotificationListViewModel.class));
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        AnonymousClass4u2.A02(this, r2, 2131828494);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
