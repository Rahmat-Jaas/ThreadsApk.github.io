package com.facebook.redex;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.core.widget.NestedScrollView;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.navigation.NavBackStackEntryState;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SeekBarPreference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.test.internal.util.ParcelableIBinder;
import androidx.versionedparcelable.ParcelImpl;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.AccessToken;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.advancedcryptotransport.model.SecurityAlert;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.avatar.autogen.download.IgModelDownloader;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText;
import com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

public class PCreatorCreatorShape0S0000000_I2 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape0S0000000_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:259:0x0465  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r17
            int r0 = r0.A00
            r2 = r18
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0013;
                case 2: goto L_0x004d;
                case 3: goto L_0x0053;
                case 4: goto L_0x0061;
                case 5: goto L_0x0067;
                case 6: goto L_0x006d;
                case 7: goto L_0x0078;
                case 8: goto L_0x007e;
                case 9: goto L_0x0084;
                case 10: goto L_0x008a;
                case 11: goto L_0x0090;
                case 12: goto L_0x0096;
                case 13: goto L_0x009c;
                case 14: goto L_0x00a6;
                case 15: goto L_0x00ac;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00b8;
                case 18: goto L_0x00be;
                case 19: goto L_0x00c4;
                case 20: goto L_0x00ca;
                case 21: goto L_0x00d4;
                case 22: goto L_0x00e5;
                case 23: goto L_0x00eb;
                case 24: goto L_0x00f1;
                case 25: goto L_0x00f7;
                case 26: goto L_0x00fd;
                case 27: goto L_0x0103;
                case 28: goto L_0x0109;
                case 29: goto L_0x010f;
                case 30: goto L_0x0115;
                case 31: goto L_0x011b;
                case 32: goto L_0x0121;
                case 33: goto L_0x0127;
                case 34: goto L_0x012d;
                case 35: goto L_0x0133;
                case 36: goto L_0x0139;
                case 37: goto L_0x0155;
                case 38: goto L_0x015b;
                case 39: goto L_0x0161;
                case 40: goto L_0x0167;
                case 41: goto L_0x0176;
                case 42: goto L_0x0188;
                case 43: goto L_0x018e;
                case 44: goto L_0x0194;
                case 45: goto L_0x019a;
                case 46: goto L_0x01a0;
                case 47: goto L_0x01a6;
                case 48: goto L_0x01b4;
                case 49: goto L_0x01ba;
                case 50: goto L_0x01c4;
                case 51: goto L_0x01ce;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01da;
                case 54: goto L_0x01e0;
                case 55: goto L_0x01e6;
                case 56: goto L_0x01ec;
                case 57: goto L_0x01f2;
                case 58: goto L_0x01f8;
                case 59: goto L_0x01fe;
                case 60: goto L_0x0204;
                case 61: goto L_0x020a;
                case 62: goto L_0x0210;
                case 63: goto L_0x0216;
                case 64: goto L_0x021c;
                case 65: goto L_0x0239;
                case 66: goto L_0x023f;
                case 67: goto L_0x0245;
                case 68: goto L_0x024b;
                case 69: goto L_0x0251;
                case 70: goto L_0x0257;
                case 71: goto L_0x025d;
                case 72: goto L_0x0263;
                case 73: goto L_0x0269;
                case 74: goto L_0x026f;
                case 75: goto L_0x0419;
                case 76: goto L_0x0275;
                case 77: goto L_0x027b;
                case 78: goto L_0x0281;
                case 79: goto L_0x0287;
                case 80: goto L_0x028d;
                case 81: goto L_0x0293;
                case 82: goto L_0x0299;
                case 83: goto L_0x029f;
                case 84: goto L_0x02a5;
                case 85: goto L_0x02ab;
                case 86: goto L_0x02b1;
                case 87: goto L_0x0306;
                case 88: goto L_0x030c;
                case 89: goto L_0x0312;
                case 90: goto L_0x0318;
                case 91: goto L_0x031e;
                case 92: goto L_0x0330;
                case 93: goto L_0x0336;
                case 94: goto L_0x033c;
                case 95: goto L_0x0363;
                case 96: goto L_0x0395;
                case 97: goto L_0x03bd;
                case 98: goto L_0x0407;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r7 = new com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel
            r7.<init>(r2)
        L_0x0012:
            return r7
        L_0x0013:
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r4 = r0.createFromParcel(r2)
            r7 = 0
            if (r4 == 0) goto L_0x0012
            android.media.MediaDescription r4 = (android.media.MediaDescription) r4
            java.lang.String r16 = r4.getMediaId()
            java.lang.CharSequence r13 = r4.getTitle()
            java.lang.CharSequence r14 = r4.getSubtitle()
            java.lang.CharSequence r15 = r4.getDescription()
            android.graphics.Bitmap r9 = r4.getIconBitmap()
            android.net.Uri r10 = r4.getIconUri()
            android.os.Bundle r5 = r4.getExtras()
            if (r5 == 0) goto L_0x0435
            java.lang.Class<X.6Cj> r0 = X.C97686Cj.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r5.setClassLoader(r0)
            goto L_0x0429
        L_0x0047:
            android.support.v4.media.MediaBrowserCompat$MediaItem r7 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r7.<init>(r2)
            return r7
        L_0x004d:
            android.support.v4.media.MediaMetadataCompat r7 = new android.support.v4.media.MediaMetadataCompat
            r7.<init>(r2)
            return r7
        L_0x0053:
            int r1 = r2.readInt()
            float r0 = r2.readFloat()
            android.support.v4.media.RatingCompat r7 = new android.support.v4.media.RatingCompat
            r7.<init>(r1, r0)
            return r7
        L_0x0061:
            android.support.v4.media.session.MediaSessionCompat$QueueItem r7 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            r7.<init>(r2)
            return r7
        L_0x0067:
            android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r7 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            r7.<init>(r2)
            return r7
        L_0x006d:
            r0 = 0
            android.os.Parcelable r0 = r2.readParcelable(r0)
            android.support.v4.media.session.MediaSessionCompat$Token r7 = new android.support.v4.media.session.MediaSessionCompat$Token
            r7.<init>(r0)
            return r7
        L_0x0078:
            android.support.v4.media.session.ParcelableVolumeInfo r7 = new android.support.v4.media.session.ParcelableVolumeInfo
            r7.<init>(r2)
            return r7
        L_0x007e:
            android.support.v4.media.session.PlaybackStateCompat r7 = new android.support.v4.media.session.PlaybackStateCompat
            r7.<init>(r2)
            return r7
        L_0x0084:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r7 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r7.<init>(r2)
            return r7
        L_0x008a:
            android.support.v4.os.ResultReceiver r7 = new android.support.v4.os.ResultReceiver
            r7.<init>(r2)
            return r7
        L_0x0090:
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r7 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState
            r7.<init>(r2)
            return r7
        L_0x0096:
            androidx.appcompat.widget.AppCompatSpinner$SavedState r7 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x009c:
            int r0 = X.C86104wH.A09(r2)
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r7 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r7.<init>(r0)
            return r7
        L_0x00a6:
            androidx.core.widget.NestedScrollView$SavedState r7 = new androidx.core.widget.NestedScrollView$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x00ac:
            androidx.media3.common.DrmInitData r7 = new androidx.media3.common.DrmInitData
            r7.<init>(r2)
            return r7
        L_0x00b2:
            androidx.media3.common.DrmInitData$SchemeData r7 = new androidx.media3.common.DrmInitData$SchemeData
            r7.<init>(r2)
            return r7
        L_0x00b8:
            androidx.media3.common.Metadata r7 = new androidx.media3.common.Metadata
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x00be:
            androidx.media3.common.StreamKey r7 = new androidx.media3.common.StreamKey
            r7.<init>(r2)
            return r7
        L_0x00c4:
            androidx.media3.exoplayer.offline.DownloadRequest r7 = new androidx.media3.exoplayer.offline.DownloadRequest
            r7.<init>(r2)
            return r7
        L_0x00ca:
            int r0 = r2.readInt()
            androidx.media3.exoplayer.scheduler.Requirements r7 = new androidx.media3.exoplayer.scheduler.Requirements
            r7.<init>(r0)
            return r7
        L_0x00d4:
            java.lang.String r1 = r2.readString()
            r1.getClass()
            int r0 = r2.readInt()
            androidx.media3.extractor.metadata.dvbsi.AppInfoTable r7 = new androidx.media3.extractor.metadata.dvbsi.AppInfoTable
            r7.<init>(r0, r1)
            return r7
        L_0x00e5:
            androidx.media3.extractor.metadata.emsg.EventMessage r7 = new androidx.media3.extractor.metadata.emsg.EventMessage
            r7.<init>(r2)
            return r7
        L_0x00eb:
            androidx.media3.extractor.metadata.flac.PictureFrame r7 = new androidx.media3.extractor.metadata.flac.PictureFrame
            r7.<init>(r2)
            return r7
        L_0x00f1:
            androidx.media3.extractor.metadata.flac.VorbisComment r7 = new androidx.media3.extractor.metadata.flac.VorbisComment
            r7.<init>(r2)
            return r7
        L_0x00f7:
            androidx.media3.extractor.metadata.icy.IcyHeaders r7 = new androidx.media3.extractor.metadata.icy.IcyHeaders
            r7.<init>(r2)
            return r7
        L_0x00fd:
            androidx.media3.extractor.metadata.icy.IcyInfo r7 = new androidx.media3.extractor.metadata.icy.IcyInfo
            r7.<init>(r2)
            return r7
        L_0x0103:
            androidx.media3.extractor.metadata.id3.ApicFrame r7 = new androidx.media3.extractor.metadata.id3.ApicFrame
            r7.<init>(r2)
            return r7
        L_0x0109:
            androidx.media3.extractor.metadata.id3.BinaryFrame r7 = new androidx.media3.extractor.metadata.id3.BinaryFrame
            r7.<init>(r2)
            return r7
        L_0x010f:
            androidx.media3.extractor.metadata.id3.ChapterFrame r7 = new androidx.media3.extractor.metadata.id3.ChapterFrame
            r7.<init>(r2)
            return r7
        L_0x0115:
            androidx.media3.extractor.metadata.id3.ChapterTocFrame r7 = new androidx.media3.extractor.metadata.id3.ChapterTocFrame
            r7.<init>(r2)
            return r7
        L_0x011b:
            androidx.media3.extractor.metadata.id3.CommentFrame r7 = new androidx.media3.extractor.metadata.id3.CommentFrame
            r7.<init>(r2)
            return r7
        L_0x0121:
            androidx.media3.extractor.metadata.id3.GeobFrame r7 = new androidx.media3.extractor.metadata.id3.GeobFrame
            r7.<init>(r2)
            return r7
        L_0x0127:
            androidx.media3.extractor.metadata.id3.InternalFrame r7 = new androidx.media3.extractor.metadata.id3.InternalFrame
            r7.<init>(r2)
            return r7
        L_0x012d:
            androidx.media3.extractor.metadata.id3.MlltFrame r7 = new androidx.media3.extractor.metadata.id3.MlltFrame
            r7.<init>(r2)
            return r7
        L_0x0133:
            androidx.media3.extractor.metadata.id3.PrivFrame r7 = new androidx.media3.extractor.metadata.id3.PrivFrame
            r7.<init>(r2)
            return r7
        L_0x0139:
            java.lang.String r3 = r2.readString()
            r3.getClass()
            java.lang.String r1 = r2.readString()
            java.lang.String[] r0 = r2.createStringArray()
            r0.getClass()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r0)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r7 = new androidx.media3.extractor.metadata.id3.TextInformationFrame
            r7.<init>(r3, r1, r0)
            return r7
        L_0x0155:
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r7 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame
            r7.<init>(r2)
            return r7
        L_0x015b:
            androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry r7 = new androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry
            r7.<init>(r2)
            return r7
        L_0x0161:
            androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata r7 = new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata
            r7.<init>(r2)
            return r7
        L_0x0167:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment> r0 = androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.class
            X.C86134wK.A17(r2, r0, r1)
            androidx.media3.extractor.metadata.mp4.SlowMotionData r7 = new androidx.media3.extractor.metadata.mp4.SlowMotionData
            r7.<init>(r1)
            return r7
        L_0x0176:
            long r8 = r2.readLong()
            long r10 = r2.readLong()
            int r12 = r2.readInt()
            androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment r7 = new androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment
            r7.<init>(r8, r10, r12)
            return r7
        L_0x0188:
            androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry r7 = new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry
            r7.<init>(r2)
            return r7
        L_0x018e:
            androidx.media3.extractor.metadata.scte35.PrivateCommand r7 = new androidx.media3.extractor.metadata.scte35.PrivateCommand
            r7.<init>(r2)
            return r7
        L_0x0194:
            androidx.media3.extractor.metadata.scte35.SpliceInsertCommand r7 = new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand
            r7.<init>(r2)
            return r7
        L_0x019a:
            androidx.media3.extractor.metadata.scte35.SpliceNullCommand r7 = new androidx.media3.extractor.metadata.scte35.SpliceNullCommand
            r7.<init>()
            return r7
        L_0x01a0:
            androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand r7 = new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand
            r7.<init>(r2)
            return r7
        L_0x01a6:
            long r3 = r2.readLong()
            long r0 = r2.readLong()
            androidx.media3.extractor.metadata.scte35.TimeSignalCommand r7 = new androidx.media3.extractor.metadata.scte35.TimeSignalCommand
            r7.<init>(r3, r0)
            return r7
        L_0x01b4:
            androidx.media3.extractor.metadata.vorbis.VorbisComment r7 = new androidx.media3.extractor.metadata.vorbis.VorbisComment
            r7.<init>(r2)
            return r7
        L_0x01ba:
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            androidx.navigation.NavBackStackEntryState r7 = new androidx.navigation.NavBackStackEntryState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01c4:
            int r0 = X.C86104wH.A09(r2)
            androidx.paging.compose.PagingPlaceholderKey r7 = new androidx.paging.compose.PagingPlaceholderKey
            r7.<init>(r0)
            return r7
        L_0x01ce:
            androidx.preference.EditTextPreference$SavedState r7 = new androidx.preference.EditTextPreference$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01d4:
            androidx.preference.ListPreference$SavedState r7 = new androidx.preference.ListPreference$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01da:
            androidx.preference.MultiSelectListPreference$SavedState r7 = new androidx.preference.MultiSelectListPreference$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01e0:
            androidx.preference.Preference$BaseSavedState r7 = new androidx.preference.Preference$BaseSavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01e6:
            androidx.preference.PreferenceGroup$SavedState r7 = new androidx.preference.PreferenceGroup$SavedState
            r7.<init>(r2)
            return r7
        L_0x01ec:
            androidx.preference.SeekBarPreference$SavedState r7 = new androidx.preference.SeekBarPreference$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01f2:
            androidx.preference.TwoStatePreference$SavedState r7 = new androidx.preference.TwoStatePreference$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01f8:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r7 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x01fe:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r7 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r7.<init>(r2)
            return r7
        L_0x0204:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x020a:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState r7 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState
            r7.<init>(r2)
            return r7
        L_0x0210:
            androidx.test.internal.util.ParcelableIBinder r7 = new androidx.test.internal.util.ParcelableIBinder
            r7.<init>(r2)
            return r7
        L_0x0216:
            androidx.versionedparcelable.ParcelImpl r7 = new androidx.versionedparcelable.ParcelImpl
            r7.<init>(r2)
            return r7
        L_0x021c:
            java.lang.Integer r1 = X.C86114wI.A0b(r2)
            java.lang.Class<X.4oS> r0 = X.C81824oS.class
            java.lang.Object r0 = X.C62533aC.A01(r0, r1)
            X.4oS r0 = (X.C81824oS) r0
            if (r0 != 0) goto L_0x0233
            java.lang.String r1 = "CdsOpenScreenCallerDismissCallback"
            java.lang.String r0 = "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage"
            X.C30967GcS.A02(r1, r0)
            X.7ch r0 = X.C125197ch.A00
        L_0x0233:
            com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback r7 = new com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback
            r7.<init>(r0)
            return r7
        L_0x0239:
            com.facebook.AccessToken r7 = new com.facebook.AccessToken
            r7.<init>(r2)
            return r7
        L_0x023f:
            com.facebook.advancedcryptotransport.model.PeerDevice r7 = new com.facebook.advancedcryptotransport.model.PeerDevice
            r7.<init>(r2)
            return r7
        L_0x0245:
            com.facebook.advancedcryptotransport.model.SecurityAlert r7 = new com.facebook.advancedcryptotransport.model.SecurityAlert
            r7.<init>(r2)
            return r7
        L_0x024b:
            com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall r7 = new com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall
            r7.<init>(r2)
            return r7
        L_0x0251:
            com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult r7 = new com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x0257:
            com.facebook.android.instantexperiences.autofill.model.AddressAutofillData r7 = new com.facebook.android.instantexperiences.autofill.model.AddressAutofillData
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x025d:
            com.facebook.android.instantexperiences.autofill.model.EmailAutofillData r7 = new com.facebook.android.instantexperiences.autofill.model.EmailAutofillData
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x0263:
            com.facebook.android.instantexperiences.autofill.model.NameAutofillData r7 = new com.facebook.android.instantexperiences.autofill.model.NameAutofillData
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x0269:
            com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData r7 = new com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x026f:
            com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall r7 = new com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall
            r7.<init>(r2)
            return r7
        L_0x0275:
            com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult r7 = new com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult
            r7.<init>((android.os.Parcel) r2)
            return r7
        L_0x027b:
            com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall r7 = new com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall
            r7.<init>(r2)
            return r7
        L_0x0281:
            com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult r7 = new com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult
            r7.<init>(r2)
            return r7
        L_0x0287:
            com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall r7 = new com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall
            r7.<init>(r2)
            return r7
        L_0x028d:
            com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult r7 = new com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult
            r7.<init>(r2)
            return r7
        L_0x0293:
            com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall r7 = new com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall
            r7.<init>(r2)
            return r7
        L_0x0299:
            com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult r7 = new com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult
            r7.<init>(r2)
            return r7
        L_0x029f:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall r7 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall
            r7.<init>(r2)
            return r7
        L_0x02a5:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall r7 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall
            r7.<init>(r2)
            return r7
        L_0x02ab:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall r7 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall
            r7.<init>(r2)
            return r7
        L_0x02b1:
            java.lang.String r0 = r2.readString()
            com.facebook.android.maps.StaticMapView$StaticMapOptions r7 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r7.<init>(r0)
            java.lang.String r0 = r2.readString()
            r7.A04 = r0
            java.lang.String r0 = r2.readString()
            r7.A0B = r0
            java.lang.String r0 = r2.readString()
            r7.A02 = r0
            java.lang.String r0 = r2.readString()
            r7.A0A = r0
            java.lang.String r0 = r2.readString()
            r7.A03 = r0
            java.lang.String r0 = r2.readString()
            r7.A05 = r0
            java.lang.String r0 = r2.readString()
            r7.A06 = r0
            java.lang.String r0 = r2.readString()
            r7.A07 = r0
            float r0 = r2.readFloat()
            r7.A00 = r0
            float r0 = r2.readFloat()
            r7.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r7.A0C = r0
            r2.readStringList(r0)
            java.lang.String r0 = r2.readString()
            r7.A09 = r0
            return r7
        L_0x0306:
            com.facebook.android.maps.model.CameraPosition r7 = new com.facebook.android.maps.model.CameraPosition
            r7.<init>(r2)
            return r7
        L_0x030c:
            com.facebook.android.maps.model.LatLng r7 = new com.facebook.android.maps.model.LatLng
            r7.<init>(r2)
            return r7
        L_0x0312:
            com.facebook.android.maps.model.LatLngBounds r7 = new com.facebook.android.maps.model.LatLngBounds
            r7.<init>(r2)
            return r7
        L_0x0318:
            com.facebook.auth.viewercontext.ViewerContext r7 = new com.facebook.auth.viewercontext.ViewerContext
            r7.<init>(r2)
            return r7
        L_0x031e:
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Class<com.facebook.avatar.autogen.download.IgModelDownloader> r0 = com.facebook.avatar.autogen.download.IgModelDownloader.class
            java.lang.Object r0 = X.C86114wI.A0e(r2, r0)
            X.0i6 r0 = (X.C10300i6) r0
            com.facebook.avatar.autogen.download.IgModelDownloader r7 = new com.facebook.avatar.autogen.download.IgModelDownloader
            r7.<init>(r0)
            return r7
        L_0x0330:
            com.facebook.avatar.autogen.flow.AESelfieCaptureConfig r7 = new com.facebook.avatar.autogen.flow.AESelfieCaptureConfig
            r7.<init>(r2)
            return r7
        L_0x0336:
            com.facebook.blescan.parcelable.ParcelableBleScanResult r7 = new com.facebook.blescan.parcelable.ParcelableBleScanResult
            r7.<init>(r2)
            return r7
        L_0x033c:
            java.lang.String r6 = X.C86104wH.A0q(r2)
            java.lang.String r5 = r2.readString()
            int r4 = r2.readInt()
            java.util.ArrayList r3 = X.C18240wQ.A0k(r4)
            r1 = 0
        L_0x034d:
            java.lang.Class<com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload> r0 = com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload.class
            android.os.Parcelable r0 = X.C18180wK.A0A(r2, r0)
            if (r1 == r4) goto L_0x035b
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x034d
        L_0x035b:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r7 = new com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload
            r7.<init>(r0, r6, r5, r3)
            return r7
        L_0x0363:
            int r9 = X.C86104wH.A09(r2)
            boolean r12 = X.C86104wH.A1W(r2)
            int r10 = r2.readInt()
            boolean r13 = X.C86104wH.A1W(r2)
            boolean r14 = X.C86104wH.A1W(r2)
            boolean r15 = X.C86104wH.A1W(r2)
            int r0 = r2.readInt()
            if (r0 != 0) goto L_0x038e
            r8 = 0
        L_0x0382:
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r8 = (com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload) r8
            int r11 = r2.readInt()
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r7 = new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L_0x038e:
            android.os.Parcelable$Creator r0 = com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload.CREATOR
            java.lang.Object r8 = r0.createFromParcel(r2)
            goto L_0x0382
        L_0x0395:
            java.lang.String r1 = X.C86104wH.A0q(r2)
            java.lang.String r0 = "LOAD_URL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03ad
            java.lang.Integer r1 = X.AnonymousClass006.A00
        L_0x03a3:
            java.lang.String r0 = r2.readString()
            com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest r7 = new com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest
            r7.<init>(r1, r0)
            return r7
        L_0x03ad:
            java.lang.String r0 = "IGNORE_META_CHECKOUT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b8
            java.lang.Integer r1 = X.AnonymousClass006.A01
            goto L_0x03a3
        L_0x03b8:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)
            throw r0
        L_0x03bd:
            java.lang.String r1 = X.C86104wH.A0q(r2)
            java.lang.String r0 = "CHECKOUT_LOADING_SCREEN_IMPRESSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03e1
            java.lang.Integer r4 = X.AnonymousClass006.A00
        L_0x03cb:
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest> r0 = com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest.class
            android.os.Parcelable r3 = X.C18180wK.A0A(r2, r0)
            com.facebook.iabadscontext.IABAdsContext r3 = (com.facebook.iabadscontext.IABAdsContext) r3
            java.lang.String r1 = r2.readString()
            java.lang.String r0 = r2.readString()
            com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest r7 = new com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest
            r7.<init>(r3, r4, r1, r0)
            return r7
        L_0x03e1:
            java.lang.String r0 = "DISCLAIMER_IMPRESSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03ec
            java.lang.Integer r4 = X.AnonymousClass006.A01
            goto L_0x03cb
        L_0x03ec:
            java.lang.String r0 = "OPT_OUT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03f7
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            goto L_0x03cb
        L_0x03f7:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0402
            java.lang.Integer r4 = X.AnonymousClass006.A0N
            goto L_0x03cb
        L_0x0402:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)
            throw r0
        L_0x0407:
            java.lang.String r3 = X.C86104wH.A0q(r2)
            int r1 = r2.readInt()
            int r0 = r2.readInt()
            com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText r7 = new com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText
            r7.<init>(r3, r1, r0)
            return r7
        L_0x0419:
            com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList r7 = new com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList     // Catch:{ JSONException -> 0x041f }
            r7.<init>(r2)     // Catch:{ JSONException -> 0x041f }
            return r7
        L_0x041f:
            r2 = move-exception
            java.lang.String r1 = "IGInstantExperiencesFeatureEnabledList"
            java.lang.String r0 = "Failed to create feature enabled list"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            r7 = 0
            return r7
        L_0x0429:
            r5.isEmpty()     // Catch:{ BadParcelableException -> 0x042d }
            goto L_0x0435
        L_0x042d:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r0 = "Could not unparcel the data."
            android.util.Log.e(r1, r0)
            r5 = r7
        L_0x0435:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r5 == 0) goto L_0x045a
            android.os.Parcelable r11 = r5.getParcelable(r3)
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L_0x0462
            java.lang.String r2 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x045c
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L_0x045c
        L_0x0450:
            android.support.v4.media.MediaDescriptionCompat r8 = new android.support.v4.media.MediaDescriptionCompat
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = r8
            r8.A00 = r4
            return r7
        L_0x045a:
            r11 = r7
            goto L_0x0462
        L_0x045c:
            r5.remove(r3)
            r5.remove(r2)
        L_0x0462:
            r7 = r5
            if (r11 != 0) goto L_0x0450
            android.net.Uri r11 = r4.getMediaUri()
            goto L_0x0450
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.PCreatorCreatorShape0S0000000_I2.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new ResultReceiver[i];
            case 11:
                return new ActionMenuPresenter$SavedState[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AppCompatSpinner$SavedState[i];
            case 13:
                return new DefaultLazyKey[i];
            case 14:
                return new NestedScrollView.SavedState[i];
            case 15:
                return new DrmInitData[i];
            case 16:
                return new DrmInitData.SchemeData[i];
            case LangUtils.HASH_SEED /*17*/:
                return new Metadata[i];
            case 18:
                return new StreamKey[i];
            case 19:
                return new DownloadRequest[i];
            case 20:
                return new Requirements[i];
            case 21:
                return new AppInfoTable[i];
            case 22:
                return new EventMessage[i];
            case 23:
                return new PictureFrame[i];
            case 24:
                return new VorbisComment[i];
            case 25:
                return new IcyHeaders[i];
            case Rfc3492Idn.tmax /*26*/:
                return new IcyInfo[i];
            case 27:
                return new ApicFrame[i];
            case 28:
                return new BinaryFrame[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new ChapterFrame[i];
            case 30:
                return new ChapterTocFrame[i];
            case 31:
                return new CommentFrame[i];
            case 32:
                return new GeobFrame[i];
            case 33:
                return new InternalFrame[i];
            case 34:
                return new MlltFrame[i];
            case 35:
                return new PrivFrame[i];
            case Rfc3492Idn.base /*36*/:
                return new TextInformationFrame[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new UrlLinkFrame[i];
            case Rfc3492Idn.skew /*38*/:
                return new MdtaMetadataEntry[i];
            case 39:
                return new MotionPhotoMetadata[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new SlowMotionData[i];
            case Seq.NULL_REFNUM /*41*/:
                return new SlowMotionData.Segment[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new SmtaMetadataEntry[i];
            case 43:
                return new PrivateCommand[i];
            case 44:
                return new SpliceInsertCommand[i];
            case 45:
                return new SpliceNullCommand[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new SpliceScheduleCommand[i];
            case 47:
                return new TimeSignalCommand[i];
            case 48:
                return new androidx.media3.extractor.metadata.vorbis.VorbisComment[i];
            case 49:
                return new NavBackStackEntryState[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new PagingPlaceholderKey[i];
            case 51:
                return new EditTextPreference.SavedState[i];
            case 52:
                return new ListPreference.SavedState[i];
            case 53:
                return new MultiSelectListPreference.SavedState[i];
            case 54:
                return new Preference.BaseSavedState[i];
            case 55:
                return new PreferenceGroup.SavedState[i];
            case 56:
                return new SeekBarPreference.SavedState[i];
            case 57:
                return new TwoStatePreference.SavedState[i];
            case 58:
                return new LinearLayoutManager.SavedState[i];
            case 59:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new StaggeredGridLayoutManager.SavedState[i];
            case 61:
                return new SwipeRefreshLayout.SavedState[i];
            case 62:
                return new ParcelableIBinder[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new ParcelImpl[i];
            case 64:
                return new CdsOpenScreenCallerDismissCallback[i];
            case 65:
                return new AccessToken[i];
            case 66:
                return new PeerDevice[i];
            case 67:
                return new SecurityAlert[i];
            case 68:
                return new RequestAutofillJSBridgeCall[i];
            case 69:
                return new RequestAutofillJSBridgeCallResult[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new AddressAutofillData[i];
            case 71:
                return new EmailAutofillData[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new NameAutofillData[i];
            case 73:
                return new TelephoneAutofillData[i];
            case 74:
                return new SaveAutofillDataJSBridgeCall[i];
            case 75:
                return new IGInstantExperiencesFeatureEnabledList[i];
            case 76:
                return new InstantExperienceGenericErrorResult[i];
            case 77:
                return new CanMakePaymentJSBridgeCall[i];
            case 78:
                return new CanMakePaymentJSBridgeCallResult[i];
            case 79:
                return new CanShowPaymentModuleJSBridgeCall[i];
            case 80:
                return new CanShowPaymentModuleJSBridgeCallResult[i];
            case 81:
                return new PaymentsCheckoutJSBridgeCall[i];
            case 82:
                return new PaymentsCheckoutJSBridgeCallResult[i];
            case 83:
                return new PaymentsChargeRequestErrorCall[i];
            case 84:
                return new PaymentsChargeRequestSuccessCall[i];
            case 85:
                return new PaymentsChargeRequestUnknownCall[i];
            case 86:
                return new StaticMapView$StaticMapOptions[i];
            case 87:
                return new CameraPosition[i];
            case 88:
                return new LatLng[i];
            case 89:
                return new LatLngBounds[i];
            case 90:
                return new ViewerContext[i];
            case 91:
                return new IgModelDownloader[i];
            case 92:
                return new AESelfieCaptureConfig[i];
            case 93:
                return new ParcelableBleScanResult[i];
            case 94:
                return new AutofillConnectPayload[i];
            case 95:
                return new AutofillSettings[i];
            case 96:
                return new MetaCheckoutRequest[i];
            case 97:
                return new CommerceMetaCheckoutLogEventRequest[i];
            case 98:
                return new DisclaimerText[i];
            default:
                return new IGCallExtensionModel[i];
        }
    }
}
