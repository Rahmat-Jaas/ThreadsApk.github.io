package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0wJ;
import X.AnonymousClass3EP;
import X.AnonymousClass3J5;
import X.AnonymousClass4VZ;
import X.AnonymousClass74I;
import X.AnonymousClass7C4;
import X.AnonymousClass8AP;
import X.C04220Ms;
import X.C111686o9;
import X.C146938n7;
import X.C146958n9;
import X.C147138nS;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C25237DiI;
import X.C25753DrP;
import X.C27442EnY;
import X.C27457Enn;
import X.C27952Ew2;
import X.C312524w;
import X.C62793ak;
import X.C83224qz;
import X.C84714tk;
import X.C86064wD;
import X.C86074wE;
import X.C86094wG;
import X.C98376Fg;
import X.DC3;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.mediakit.api.MediaKitApi;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

public final class CamDevOptionsViewModel extends C62793ak {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C86074wE _bcEligibilityLoading;
    public final C86074wE _creatorMarketplaceOnboardingLoading;
    public final C86074wE _uiState;
    public final C86094wG actionBarTitleFlow;
    public final C86094wG bcEligibility;
    public final C86094wG bcEligibilityLoading;
    public final BrandedContentSettingsRepository brandedContentRepository;
    public final C86094wG creatorMarketplaceOnboardingLoading;
    public final C86064wD eventChannel;
    public final C84714tk eventFlow;
    public final C86094wG isOnboardedToCreatorMarketplace;
    public final AnonymousClass3EP mediaKitPreferences;
    public final C86094wG uiState;
    public final UserSession userSession;

    public final class Factory implements C147138nS {
        public static final int $stable = 8;
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            C04220Ms.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
            return C98376Fg.A00(this, cls);
        }

        public C62793ak create(Class cls) {
            UserSession userSession2 = this.userSession;
            C04220Ms.A0B(userSession2, 0);
            return new CamDevOptionsViewModel(userSession2, (BrandedContentSettingsRepository) userSession2.A01(BrandedContentSettingsRepository.class, new KtLambdaShape39S0100000_I2_19(userSession2, 29)), DC3.A00(this.userSession));
        }
    }

    public interface UIEvent {

        public final class LaunchMediaKitSettings implements UIEvent {
            public static final int $stable = 0;
            public static final LaunchMediaKitSettings INSTANCE = new LaunchMediaKitSettings();
        }

        public final class ShowToast implements UIEvent {
            public static final int $stable = 0;
            public final int stringResId;

            public final int getStringResId() {
                return this.stringResId;
            }

            public ShowToast(int i) {
                this.stringResId = i;
            }
        }
    }

    public abstract class UIState {
        public static final int $stable = 0;
        public final boolean loading;

        public /* synthetic */ UIState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final UIState showLoading(boolean z) {
            if (this instanceof CamSettings) {
                return new CamSettings(z);
            }
            if (this instanceof MediaKitResetNux) {
                return new MediaKitResetNux(z);
            }
            throw AnonymousClass4VZ.A00();
        }

        public final class CamSettings extends UIState {
            public static final int $stable = 0;

            public CamSettings(boolean z) {
                super(z);
            }
        }

        public final class MediaKitResetNux extends UIState {
            public static final int $stable = 0;

            public MediaKitResetNux(boolean z) {
                super(z);
            }
        }

        public UIState(boolean z) {
            this.loading = z;
        }
    }

    public /* synthetic */ CamDevOptionsViewModel(UserSession userSession2, BrandedContentSettingsRepository brandedContentSettingsRepository, AnonymousClass3EP r3, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession2, brandedContentSettingsRepository, r3);
    }

    public final void launchMediaKitResetNux() {
        setUIState(new UIState.MediaKitResetNux(false));
    }

    public final void resetNux(C312524w r5) {
        C04220Ms.A0B(r5, 0);
        AnonymousClass3EP r2 = this.mediaKitPreferences;
        int ordinal = r5.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            AnonymousClass0wJ.A13(r2.A00.edit(), r5.A00, false);
        }
        showToast(2131825323);
    }

    /* access modifiers changed from: private */
    public final void hideLoading() {
        this._uiState.CrC(((UIState) this.uiState.getValue()).showLoading(false));
    }

    private final void setUIState(UIState uIState) {
        this._uiState.CrC(uIState);
    }

    /* access modifiers changed from: private */
    public final void showToast(int i) {
        sendEvent(new UIEvent.ShowToast(i));
    }

    /* access modifiers changed from: private */
    public final int titleRes(UIState uIState) {
        if (uIState instanceof UIState.CamSettings) {
            return 2131825099;
        }
        if (uIState instanceof UIState.MediaKitResetNux) {
            return 2131825322;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final C86094wG getActionBarTitleFlow() {
        return this.actionBarTitleFlow;
    }

    public final C86094wG getBcEligibility() {
        return this.bcEligibility;
    }

    public final C86094wG getBcEligibilityLoading() {
        return this.bcEligibilityLoading;
    }

    public final C86094wG getCreatorMarketplaceOnboardingLoading() {
        return this.creatorMarketplaceOnboardingLoading;
    }

    public final C84714tk getEventFlow() {
        return this.eventFlow;
    }

    public final C86094wG getUiState() {
        return this.uiState;
    }

    public final C86094wG isOnboardedToCreatorMarketplace() {
        return this.isOnboardedToCreatorMarketplace;
    }

    public final boolean onBackPressed() {
        Object value = this.uiState.getValue();
        if (value instanceof UIState.MediaKitResetNux) {
            setUIState(new UIState.CamSettings(false));
            return true;
        } else if (value instanceof UIState.CamSettings) {
            return false;
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    public final void showLoading() {
        this._uiState.CrC(((UIState) this.uiState.getValue()).showLoading(true));
    }

    public final class Companion {
        public final CamDevOptionsViewModel testCamDevOptionsViewModel(UserSession userSession, MediaKitApi mediaKitApi, BrandedContentSettingsRepository brandedContentSettingsRepository, AnonymousClass3EP r5) {
            C04220Ms.A0B(userSession, 0);
            AnonymousClass0wJ.A1Q(brandedContentSettingsRepository, r5);
            return new CamDevOptionsViewModel(userSession, brandedContentSettingsRepository, r5);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public CamDevOptionsViewModel(UserSession userSession2, BrandedContentSettingsRepository brandedContentSettingsRepository, AnonymousClass3EP r9) {
        this.userSession = userSession2;
        this.brandedContentRepository = brandedContentSettingsRepository;
        this.mediaKitPreferences = r9;
        C27457Enn A0z = C18190wL.A0z(new UIState.CamSettings(false));
        this._uiState = A0z;
        this.uiState = C18230wP.A0x((C148838sG) null, A0z);
        CamDevOptionsViewModel$special$$inlined$map$1 camDevOptionsViewModel$special$$inlined$map$1 = new CamDevOptionsViewModel$special$$inlined$map$1(A0z, this);
        C83224qz A00 = AnonymousClass3J5.A00(this);
        C146938n7 r4 = AnonymousClass74I.A01;
        this.actionBarTitleFlow = C25753DrP.A04(2131825099, A00, camDevOptionsViewModel$special$$inlined$map$1, r4);
        C27442EnY enY = new C27442EnY();
        this.eventChannel = enY;
        this.eventFlow = AnonymousClass7C4.A02(enY);
        C86094wG r3 = brandedContentSettingsRepository.A0C;
        this.isOnboardedToCreatorMarketplace = C25753DrP.A04(false, AnonymousClass3J5.A00(this), new CamDevOptionsViewModel$special$$inlined$map$2(r3), r4);
        Boolean A0Y = C18180wK.A0Y();
        C27457Enn A0z2 = C18190wL.A0z(A0Y);
        this._creatorMarketplaceOnboardingLoading = A0z2;
        this.creatorMarketplaceOnboardingLoading = A0z2;
        this.bcEligibility = C25753DrP.A04(false, AnonymousClass3J5.A00(this), new CamDevOptionsViewModel$special$$inlined$map$3(r3), r4);
        C27457Enn A0z3 = C18190wL.A0z(A0Y);
        this._bcEligibilityLoading = A0z3;
        this.bcEligibilityLoading = A0z3;
        fetchCreatorMarketplaceOnboardingStatus();
        fetchBrandedContentEligibility();
    }

    /* access modifiers changed from: private */
    public final void configureUserEligibility(boolean z) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$configureUserEligibility$1(z, this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    /* access modifiers changed from: private */
    public final void notifyFailure() {
        showToast(2131825357);
    }

    /* access modifiers changed from: private */
    public final void sendEvent(UIEvent uIEvent) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$sendEvent$1(this, uIEvent, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void fetchBrandedContentEligibility() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$fetchBrandedContentEligibility$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void fetchCreatorMarketplaceOnboardingStatus() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$fetchCreatorMarketplaceOnboardingStatus$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final List getAllMediaKitNux() {
        return AnonymousClass8AP.A0B(C312524w.values());
    }

    public final void launchMediaKitFeedSettings() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$launchMediaKitFeedSettings$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void toggleBCCreatorMarketplaceOnboarding() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void toggleBrandedContentPaidPartnershipLabel() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }
}
