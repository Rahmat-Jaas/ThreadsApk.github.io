package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass5Ha;
import X.C109216je;
import X.C111046mh;
import X.C112056ou;
import X.C146958n9;
import X.C22161CJs;
import X.C25546Dne;
import X.C27236EjA;
import X.C27659ErA;
import X.C27809Ete;
import X.C86104wH;
import X.C968767a;
import X.D2O;
import android.net.Uri;
import androidx.paging.PagingSource;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape83S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.onboarding.data.OnboardingRespository;
import com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository;
import com.instagram.barcelona.profile.data.ProfileFeedDataSource;
import com.instagram.barcelona.profile.editor.ProfileEditorViewModel;
import com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl;
import com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl;
import com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository;
import com.instagram.barcelona.profile.ui.ProfileViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.casper.IgSignalsCasperProduct$Companion;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel;
import com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource;
import com.instagram.clips.drafts.model.migrations.ClipsDraftInfoMigration;
import com.instagram.clips.drafts.model.migrations.FeedVideoClipsDraftMigration;
import com.instagram.clips.drafts.model.validation.ClipsDraftValidator;
import com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil;
import com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsDraftRepository;
import com.instagram.creation.capture.quickcapture.template.v2.repository.ClipsTemplateBrowserSectionContentPagingSource;
import com.instagram.creation.capture.quickcapture.undo.model.UndoReelMediaEditsViewModel;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.List;

public class KtCImplShape2S0301000_I2_1 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape2S0301000_I2_1(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape2S0301000_I2_1) || ((KtCImplShape2S0301000_I2_1) obj).A04 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                return ((OnboardingRespository) C86104wH.A0m(obj, this)).A04(this);
            case 1:
                return ((OnboardingRespository) C86104wH.A0m(obj, this)).AMV(this);
            case 2:
                return ((OnboardingRespository) C86104wH.A0m(obj, this)).A05(this);
            case 3:
                return ((OnboardingRespository) C86104wH.A0m(obj, this)).A06(this);
            case 4:
                return ((OnboardingSuggestedFollowingRepository) C86104wH.A0m(obj, this)).A01((UserSession) null, this, (AnonymousClass0ZU) null);
            case 5:
                return ProfileFeedDataSource.A01((ProfileFeedDataSource) C86104wH.A0m(obj, this), this, false);
            case 6:
                return ProfileEditorViewModel.A00((ProfileEditorViewModel) C86104wH.A0m(obj, this), this);
            case 7:
                return ((IDxFCollectorShape230S0100000_2_I2) C86104wH.A0m(obj, this)).A02((C968767a) null, this);
            case 8:
                return ((ProfilePictureDelegateImpl) C86104wH.A0m(obj, this)).A01((C968767a) null, this);
            case 9:
                return ProfilePictureDelegateImpl.A00((Uri) null, (ProfilePictureDelegateImpl) C86104wH.A0m(obj, this), this);
            case 10:
                return ((EditProfileRepositoryProfileEditorImpl) C86104wH.A0m(obj, this)).A00(this);
            case 11:
                return ((EditProfileRepositoryProfileEditorImpl) C86104wH.A0m(obj, this)).AMV(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((FollowingGraphRepository) C86104wH.A0m(obj, this)).A03(this);
            case 13:
                return ProfileViewModel.A00((ProfileViewModel) C86104wH.A0m(obj, this), (String) null, this);
            case 14:
                return ((BrandedContentDisclosureBaseViewModel) C86104wH.A0m(obj, this)).A04(this);
            case 15:
                return ((BrandedContentDisclosureMenuViewModel) C86104wH.A0m(obj, this)).A0E(this);
            case 16:
                return ((BrandedContentDisclosureViewModel) C86104wH.A0m(obj, this)).A0E((String) null, this);
            case LangUtils.HASH_SEED /*17*/:
                return ((BrandedContentProjectRepository) C86104wH.A0m(obj, this)).A01((ImmutableList) null, this, 0);
            case 18:
                return ((BrandedContentSettingsRepository) C86104wH.A0m(obj, this)).A01((List) null, this);
            case 19:
                return ((EffectTrayService) C86104wH.A0m(obj, this)).A05((C111046mh) null, this);
            case 20:
                return EffectTrayService.A01((C111046mh) null, (EffectTrayService) C86104wH.A0m(obj, this), this);
            case 21:
                return ((EffectsByIdMetadataService) C86104wH.A0m(obj, this)).A02((C111046mh) null, this);
            case 22:
                return IgSignalsCasper.A02((IgSignalsCasper) C86104wH.A0m(obj, this), this);
            case 23:
                return ((IgSignalsCasperProduct$Companion) C86104wH.A0m(obj, this)).A00((UserSession) null, (String) null, this);
            case 24:
                return ClipsSoundSyncBeatsInfoRepository.A00((ClipsSoundSyncBeatsInfoRepository) C86104wH.A0m(obj, this), (C109216je) null, this);
            case 25:
                return ClipsSoundSyncViewModel.A01((ClipsSoundSyncViewModel) C86104wH.A0m(obj, this), (String) null, this, 0, 0);
            case Rfc3492Idn.tmax /*26*/:
                return ((ClipsImportDraftDataSource) C86104wH.A0m(obj, this)).A00((String) null, this);
            case 27:
                return ((ClipsImportDraftDataSource) C86104wH.A0m(obj, this)).A01((String) null, this);
            case 28:
                return ((ClipsDraftInfoMigration) C86104wH.A0m(obj, this)).BgE(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return ((FeedVideoClipsDraftMigration) C86104wH.A0m(obj, this)).BgE(this);
            case 30:
                return ((ClipsDraftValidator) C86104wH.A0m(obj, this)).A01((String) null, this);
            case 31:
                return ClipsMidcardValidDisplayModelUtil.A01((AnonymousClass5Ha) null, (ClipsMidcardValidDisplayModelUtil) C86104wH.A0m(obj, this), (UserSession) null, this);
            case 32:
                return ((CoroutineHttpService$ChannelHttpResponse) C86104wH.A0m(obj, this)).A00(this);
            case 33:
                return ((CoroutineHttpService$ChannelHttpResponse) C86104wH.A0m(obj, this)).A01(this);
            case 34:
            case 35:
            case Rfc3492Idn.base /*36*/:
            case LangUtils.HASH_OFFSET /*37*/:
                return ((IDxFCollectorShape83S0200000_1_I2) C86104wH.A0m(obj, this)).emit((Object) null, this);
            case Rfc3492Idn.skew /*38*/:
                return StoryDraftsCreationViewModel.A00((StoryDraftsCreationViewModel) C86104wH.A0m(obj, this), (C27809Ete) null, (C22161CJs) null, this);
            case 39:
                return ((StoryDraftsStore) C86104wH.A0m(obj, this)).A03(this);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return ClipsStackedTimelineFragment.A01((ClipsStackedTimelineFragment) C86104wH.A0m(obj, this), this);
            case Seq.NULL_REFNUM /*41*/:
                return ((SfxAudioRepository) C86104wH.A0m(obj, this)).A01(this);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((ClipsCreationDraftViewModel) C86104wH.A0m(obj, this)).A0F((String) null, this);
            case 43:
                return ((ClipsDraftRepository) C86104wH.A0m(obj, this)).A0B((D2O) null, this);
            case 44:
                return ((ClipsDraftRepository) C86104wH.A0m(obj, this)).A0A((C25546Dne) null, this);
            case 45:
                return ClipsDraftRepository.A03((ClipsDraftRepository) C86104wH.A0m(obj, this), this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ClipsDraftRepository.A02((ClipsDraftRepository) C86104wH.A0m(obj, this), (C27659ErA) null, this);
            case 47:
                return ((PagingSource) C86104wH.A0m(obj, this)).A01((C112056ou) null, this);
            case 48:
                return ClipsTemplateBrowserSectionContentPagingSource.A00((ClipsTemplateBrowserSectionContentPagingSource) C86104wH.A0m(obj, this), (String) null, this);
            default:
                return ((UndoReelMediaEditsViewModel) C86104wH.A0m(obj, this)).A05(this);
        }
    }
}
