package com.instagram.debug.devoptions;

import X.AnonymousClass0e5;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C06750aI;
import X.C18180wK;
import X.C18210wN;
import X.C18240wQ;
import com.instagram.debug.devoptions.L;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DirectInboxDevUtil {
    public static final Companion Companion = new Companion();
    public final InboxV2Variant POGS_VARIANT;
    public final List directInboxBoolParams;
    public final List directInboxStringParams;
    public final DirectInboxFlags flags;
    public final List inboxV2VariantList;
    public final QuickExperimentDebugStore quickExperimentDebugStore;
    public final UserSession userSession;

    public final class ExperimentFlag {
        public final String description;
        public final String name;
        public final AnonymousClass0e5 param;
        public final /* synthetic */ DirectInboxDevUtil this$0;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExperimentFlag(DirectInboxDevUtil directInboxDevUtil, String str, AnonymousClass0e5 r4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(directInboxDevUtil, str, r4, (i & 4) != 0 ? "" : str2);
        }

        public final void clearOverride() {
            this.this$0.quickExperimentDebugStore.removeOverriddenParameter(this.param);
        }

        public final Object getCurrentValue() {
            return this.param.A01(this.this$0.userSession);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final void overrideValue(Object obj) {
            this.this$0.quickExperimentDebugStore.putOverriddenParameter(this.param, String.valueOf(obj));
        }

        public ExperimentFlag(DirectInboxDevUtil directInboxDevUtil, String str, AnonymousClass0e5 r4, String str2) {
            AnonymousClass0wJ.A1Q(str, r4);
            C04220Ms.A0B(str2, 4);
            this.this$0 = directInboxDevUtil;
            this.name = str;
            this.param = r4;
            this.description = str2;
        }
    }

    public DirectInboxDevUtil(UserSession userSession2, QuickExperimentDebugStore quickExperimentDebugStore2) {
        UserSession userSession3 = userSession2;
        QuickExperimentDebugStore quickExperimentDebugStore3 = quickExperimentDebugStore2;
        AnonymousClass0wJ.A1M(userSession3, 1, quickExperimentDebugStore3);
        this.userSession = userSession3;
        this.quickExperimentDebugStore = quickExperimentDebugStore3;
        List A17 = C06750aI.A17(new ExperimentFlag(this, "enabled", L.ig_android_cf_hub.enabled.getParameter(), ""), new ExperimentFlag(this, "is_active_now_enabled", L.ig_android_cf_hub.is_active_now_enabled.getParameter(), ""), new ExperimentFlag(this, "is_logging_enabled", L.ig_android_cf_hub.is_logging_enabled.getParameter(), ""), new ExperimentFlag(this, "is_dynamic_text_enabled", L.ig_android_cf_hub.is_dynamic_text_enabled.getParameter(), ""), new ExperimentFlag(this, "is_close_friends_icon_enabled", L.ig_android_cf_hub.is_close_friends_icon_enabled.getParameter(), ""), new ExperimentFlag(this, "is_music_notes_enabled", L.ig_android_music_notes.enabled.getParameter(), ""), new ExperimentFlag(this, "is_music_notes_auto_play_enabled", L.ig_android_music_notes.music_note_auto_play.getParameter(), ""), new ExperimentFlag(this, "mvp_polish_enabled", L.ig_android_notes_creation.mvp_polish_enabled.getParameter(), ""), new ExperimentFlag(this, "foundational_changes_enabled", L.ig_android_notes_creation.foundational_changes_enabled.getParameter(), ""));
        this.directInboxBoolParams = A17;
        List A0n = C18180wK.A0n(new ExperimentFlag(this, "hub_layout_type", L.ig_android_cf_hub.hub_layout_type.getParameter(), ""));
        this.directInboxStringParams = A0n;
        DirectInboxFlags directInboxFlags = new DirectInboxFlags(A17, A0n);
        this.flags = directInboxFlags;
        InboxV2Variant create = InboxV2Variant.Companion.create("Pogs with notes + active now", "POGS", directInboxFlags, "ONE_ROW_POGS", true);
        this.POGS_VARIANT = create;
        this.inboxV2VariantList = C18180wK.A0n(create);
    }

    public static final DirectInboxDevUtil getInstance(UserSession userSession2, QuickExperimentDebugStore quickExperimentDebugStore2) {
        return Companion.getInstance(userSession2, quickExperimentDebugStore2);
    }

    public final class Companion {
        public final DirectInboxDevUtil getInstance(UserSession userSession, QuickExperimentDebugStore quickExperimentDebugStore) {
            AnonymousClass0wJ.A1N(userSession, quickExperimentDebugStore);
            return (DirectInboxDevUtil) userSession.A01(DirectInboxDevUtil.class, new DirectInboxDevUtil$Companion$getInstance$1(userSession, quickExperimentDebugStore));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final void enableCloseFriendsIcon(boolean z) {
        C18210wN.A1H(this.flags, "is_close_friends_icon_enabled", z);
    }

    public final void enableDynamicText(boolean z) {
        C18210wN.A1H(this.flags, "is_dynamic_text_enabled", z);
    }

    public final void enableFoundationalChanges(boolean z) {
        C18210wN.A1H(this.flags, "foundational_changes_enabled", z);
    }

    public final void enableImmersiveCreation(boolean z) {
        C18210wN.A1H(this.flags, "mvp_polish_enabled", z);
    }

    public final void enableInboxV2(boolean z) {
        C18210wN.A1H(this.flags, "enabled", z);
    }

    public final void enableLogging(boolean z) {
        C18210wN.A1H(this.flags, "is_logging_enabled", z);
    }

    public final void enableMusicNotes(boolean z) {
        C18210wN.A1H(this.flags, "is_music_notes_enabled", z);
    }

    public final void enableMusicNotesAutoPlay(boolean z) {
        C18210wN.A1H(this.flags, "is_music_notes_auto_play_enabled", z);
    }

    public final String getCurrentlySelectedInboxV2VariantHumanName() {
        if (this.POGS_VARIANT.isActive()) {
            return this.POGS_VARIANT.getHumanName();
        }
        return "Custom";
    }

    public final List getInboxV2VariantList() {
        return this.inboxV2VariantList;
    }

    public final boolean isFoundationalChangesEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "foundational_changes_enabled"));
    }

    public final boolean isImmersiveCreationEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "mvp_polish_enabled"));
    }

    public final boolean isInboxV2CloseFriendsIconEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "is_close_friends_icon_enabled"));
    }

    public final boolean isInboxV2DynamicTextEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "is_dynamic_text_enabled"));
    }

    public final boolean isInboxV2Enabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "enabled"));
    }

    public final boolean isInboxV2LoggingEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "is_logging_enabled"));
    }

    public final boolean isMusicNotesAutoPlayEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "is_music_notes_auto_play_enabled"));
    }

    public final boolean isMusicNotesEnabled() {
        return AnonymousClass0wJ.A1X(C18240wQ.A0Z(this.flags, "is_music_notes_enabled"));
    }

    public final void resetParams() {
        for (ExperimentFlag clearOverride : this.flags.booleanParams) {
            clearOverride.clearOverride();
        }
        for (ExperimentFlag clearOverride2 : this.flags.stringParams) {
            clearOverride2.clearOverride();
        }
    }

    public final void setInboxV2Variant(int i) {
        ((InboxV2Variant) this.inboxV2VariantList.get(i)).setOverrides();
    }

    public final void setFoundationalChangesEnabled(boolean z) {
        enableFoundationalChanges(z);
    }

    public final void setImmersiveCreationEnabled(boolean z) {
        enableImmersiveCreation(z);
    }

    public final void setInboxV2CloseFriendsIconEnabled(boolean z) {
        enableCloseFriendsIcon(z);
    }

    public final void setInboxV2DynamicTextEnabled(boolean z) {
        enableDynamicText(z);
    }

    public final void setInboxV2Enabled(boolean z) {
        enableInboxV2(z);
    }

    public final void setInboxV2LoggingEnabled(boolean z) {
        enableLogging(z);
    }

    public final void setMusicNotesAutoPlayEnabled(boolean z) {
        enableMusicNotesAutoPlay(z);
    }

    public final void setMusicNotesEnabled(boolean z) {
        enableMusicNotes(z);
    }
}
