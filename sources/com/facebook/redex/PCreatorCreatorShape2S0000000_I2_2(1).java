package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass67L;
import X.AnonymousClass68Q;
import X.AnonymousClass68T;
import X.AnonymousClass69U;
import X.AnonymousClass69W;
import X.AnonymousClass7Kx;
import X.C04220Ms;
import X.C108816iz;
import X.C108826j0;
import X.C111296n6;
import X.C116826xc;
import X.C116876xh;
import X.C116886xi;
import X.C148488rA;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C40307LcE;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C969767l;
import X.C972568q;
import X.C973368y;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.graphql.impls.CardVerificationFieldsImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.login.LoginClient$Result;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.messaging.encryptedbackups.encryptedbackupsmanager.model.OneTimeCodeDevice;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.reportaproblem.base.bugreport.file.BugReportFile;
import com.facebook.sensors.parcelable.ParcelableSensorEventClone;
import com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.DrawableBackedEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.heroplayer.ipc.AbrContextualSetting;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import com.facebook.video.heroplayer.ipc.HttpTransferStartEvent;
import com.facebook.video.heroplayer.ipc.InitSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.InitSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.LatencyMeasureLiveTraceFrame;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableCue;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ParcelableTimeRange;
import com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueCompleteEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueExitEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueStartEvent;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.VideoFrameMetadata;
import com.facebook.video.heroplayer.ipc.VideoMemoryState;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import com.facebook.wearable.common.comms.rtc.model2.gen.Call;
import com.facebook.wearable.common.comms.rtc.model2.gen.CallIntent;
import com.facebook.wearable.common.comms.rtc.model2.gen.DisconnectIntent;
import com.facebook.wearable.common.comms.rtc.model2.gen.Participant;
import com.facebook.wearable.common.comms.rtc.model2.gen.ThreadInfo;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPromoCodeItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionOfferViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPromoCodeViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.EnumMap;

public class PCreatorCreatorShape2S0000000_I2_2 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape2S0000000_I2_2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Integer A0b;
        AnonymousClass67L valueOf;
        AnonymousClass69W valueOf2;
        Integer A0b2;
        Integer A0b3;
        Integer num;
        Boolean valueOf3;
        Integer A0b4;
        ArrayList A0k;
        Integer A002;
        Integer A0b5;
        Integer A003;
        Integer A0b6;
        C969767l valueOf4;
        Integer A0b7;
        Integer A0b8;
        Integer A0b9;
        C973368y valueOf5;
        C973368y valueOf6;
        Integer A0b10;
        Integer num2;
        Integer num3;
        ClassLoader classLoader;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                return new LoginClient$Result(parcel2);
            case 1:
                return new MapOptions(parcel2);
            case 2:
                return new OneTimeCodeDevice(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 3:
                return new DirectInstallDownloadEvent(parcel2);
            case 4:
                try {
                    TreeJNI A004 = TreeParcelable.A00(parcel2);
                    if (A004 != null) {
                        return new TreeParcelable(A004);
                    }
                    return null;
                } catch (Exception e) {
                    AnonymousClass0LU.A0P("TreeParcelable::Creator", "Failed to create Parcelable for the given Pando tree: %s", e.toString());
                    return null;
                }
            case 5:
                String A0q = C86104wH.A0q(parcel2);
                if (A0q != null) {
                    if (!A0q.equals(FXPFLinkageCacheDebugFragment.nullString)) {
                        classLoader = Class.forName(A0q).getClassLoader();
                    } else {
                        classLoader = null;
                    }
                    Object readValue = parcel2.readValue(classLoader);
                    Parcelable A0A = C18180wK.A0A(parcel2, ZonePolicy.class);
                    if (A0A != null) {
                        return new ZonedValue((ZonePolicy) A0A, readValue);
                    }
                    throw C18190wL.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            case 6:
                AnonymousClass68Q valueOf7 = AnonymousClass68Q.valueOf(C86104wH.A0q(parcel2));
                String readString = parcel2.readString();
                if (readString.equals("FULL_THROW")) {
                    num3 = AnonymousClass006.A00;
                } else if (readString.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    num3 = AnonymousClass006.A01;
                } else {
                    throw C18190wL.A0a(readString);
                }
                return new ZonePolicy(valueOf7, num3);
            case 7:
                return new BugReportFile(parcel2);
            case 8:
                C04220Ms.A0B(parcel2, 0);
                return new ParcelableSensorEventClone(parcel2);
            case 9:
                return new DefaultEvidenceRecorderProvider(parcel2);
            case 10:
                return new SelfieEvidence(parcel2);
            case 11:
                C04220Ms.A0B(parcel2, 0);
                return new ChallengeProvider(parcel2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C04220Ms.A0B(parcel2, 0);
                return new IgVoltronAndNmlModulesDownloader(parcel2);
            case 13:
                return new IdCaptureConfig(parcel2);
            case 14:
                return new SelfieCaptureConfig(parcel2);
            case 15:
                C04220Ms.A0B(parcel2, 0);
                return new IgSmartCaptureLoggerProvider(parcel2);
            case 16:
                C04220Ms.A0B(parcel2, 0);
                EnumMap enumMap = new EnumMap(AnonymousClass68T.class);
                C86134wK.A19(parcel2, AnonymousClass68T.CONSENT_GRANTED_MESSAGE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.CONSENT_GRANTED_DETAILS, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.CONSENT_WITHDRAWN_MESSAGE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.CONSENT_WITHDRAWN_DETAILS, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_TITLE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_BODY1, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_BODY2, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_CONTINUE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_TOGGLE_TEXT, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.BOTTOM_SHEET_LEARN_MORE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_TITLE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_BODY, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_FIRST_SECTION_TITLE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_FIRST_SECTION_BODY1, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_FIRST_SECTION_BODY2, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_SECOND_SECTION_TITLE, enumMap);
                C86134wK.A19(parcel2, AnonymousClass68T.DATA_INFORMATION_SECOND_SECTION_BODY, enumMap);
                return new ResolvedConsentTextsProvider(new C111296n6(enumMap));
            case LangUtils.HASH_SEED /*17*/:
                return new BasicEmoji(parcel2);
            case 18:
                return new DrawableBackedEmoji(parcel2);
            case 19:
                return new EmojiSet(parcel2);
            case 20:
                return new EmojiSet.Metadata(parcel2);
            case 21:
                return new PlayerOrigin(parcel2);
            case 22:
                return new AbrContextualSetting(parcel2);
            case 23:
                return new AudioFocusLossSettings(parcel2);
            case 24:
                return new DeviceOrientationFrame(parcel2);
            case 25:
                return new DynamicPlayerSettings(parcel2);
            case Rfc3492Idn.tmax /*26*/:
                return new FirstDataSegmentCacheCheckEndEvent(parcel2);
            case 27:
                return new FirstDataSegmentCacheCheckStartEvent(parcel2);
            case 28:
                return new HeroScrollSetting(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new HttpTransferRequestedEvent(parcel2);
            case 30:
                return new HttpTransferStartEvent(parcel2);
            case 31:
                return new InitSegmentCacheCheckEndEvent(parcel2);
            case 32:
                return new InitSegmentCacheCheckStartEvent(parcel2);
            case 33:
                return new LatencyMeasureLiveTraceFrame(parcel2);
            case 34:
                return new LiveState(parcel2);
            case 35:
                return new ParcelableCue(parcel2);
            case Rfc3492Idn.base /*36*/:
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                int readInt = parcel2.readInt();
                int readInt2 = parcel2.readInt();
                float readFloat = parcel2.readFloat();
                int readInt3 = parcel2.readInt();
                int readInt4 = parcel2.readInt();
                int readInt5 = parcel2.readInt();
                return new ParcelableFormat(readString2, readString3, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), readFloat, readInt, readInt2, readInt3, readInt4, readInt5, parcel2.readInt(), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1), AnonymousClass0wJ.A1T(parcel2.readInt(), 1));
            case LangUtils.HASH_OFFSET /*37*/:
                return new ParcelableTimeRange(parcel2.readLong(), parcel2.readLong());
            case Rfc3492Idn.skew /*38*/:
                return new PrefetchTaskDataFetchIssuedEvent(parcel2);
            case 39:
                return new PrefetchTaskQueueCompleteEvent(parcel2);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new PrefetchTaskQueueExitEvent(parcel2);
            case Seq.NULL_REFNUM /*41*/:
                return new PrefetchTaskQueueStartEvent(parcel2);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new ServicePlayerState(parcel2);
            case 43:
                return new SpatialAudioFocusParams(parcel2);
            case 44:
                return new VideoFrameMetadata(parcel2);
            case 45:
                int readInt6 = parcel2.readInt();
                SparseArray sparseArray = VideoMemoryState.A01;
                if (sparseArray.get(readInt6) != null) {
                    return sparseArray.get(readInt6);
                }
                throw C18190wL.A0a("Invalid VideoMemoryState value");
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new VideoPlayContextualSetting(parcel2);
            case 47:
                return new VideoPlayRequest(parcel2);
            case 48:
                return new VideoPrefetchRequest(parcel2);
            case 49:
                return new VideoProtocolProps(parcel2);
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new VideoSource(parcel2);
            case 51:
                return new SphericalMetadata(parcel2);
            case 52:
                return new Call(parcel2);
            case 53:
                return new CallIntent(parcel2);
            case 54:
                return new DisconnectIntent(parcel2);
            case 55:
                return new Participant(parcel2);
            case 56:
                return new ThreadInfo(parcel2);
            case 57:
                return new ParcelableWifiScanResult(parcel2);
            case 58:
                C04220Ms.A0B(parcel2, 0);
                byte[] createByteArray = parcel2.createByteArray();
                if (createByteArray == null) {
                    createByteArray = new byte[0];
                }
                int length = createByteArray.length;
                if (length == 0) {
                    return Capabilities.A01;
                }
                BitSet bitSet = new BitSet(length << 3);
                int i = 0;
                do {
                    byte b = createByteArray[i];
                    int i2 = 0;
                    do {
                        if (((1 << i2) & b) != 0) {
                            bitSet.set((i << 3) + i2);
                        }
                        i2++;
                    } while (i2 < 8);
                    i++;
                } while (i < length);
                return new Capabilities(bitSet);
            case 59:
                return new APMBloksNativeProps(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new CurrencyAmount(C86104wH.A0q(parcel2), parcel2.readString());
            case 61:
                C04220Ms.A0B(parcel2, 0);
                double readDouble = parcel2.readDouble();
                String readString4 = parcel2.readString();
                if (readString4.equals("MILES")) {
                    num2 = AnonymousClass006.A00;
                } else if (readString4.equals("KILOMETERS")) {
                    num2 = AnonymousClass006.A01;
                } else {
                    throw C18190wL.A0a(readString4);
                }
                return new Distance(num2, readDouble);
            case 62:
                String A0q2 = C86104wH.A0q(parcel2);
                String readString5 = parcel2.readString();
                Class<ErrorDialogContent> cls = ErrorDialogContent.class;
                C108816iz r11 = (C108816iz) C86114wI.A0e(parcel2, cls);
                C108816iz r12 = (C108816iz) C86114wI.A0e(parcel2, cls);
                Integer num4 = null;
                if (parcel2.readInt() == 0) {
                    A0b8 = null;
                } else {
                    A0b8 = C86114wI.A0b(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    A0b9 = null;
                } else {
                    A0b9 = C86114wI.A0b(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = C973368y.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = C973368y.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    A0b10 = null;
                } else {
                    A0b10 = C86114wI.A0b(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    String readString6 = parcel2.readString();
                    if (readString6.equals("USER_CANCELLATION")) {
                        num4 = AnonymousClass006.A00;
                    } else if (readString6.equals("SYSTEM_ERROR")) {
                        num4 = AnonymousClass006.A01;
                    } else if (readString6.equals("CHECKOUT_ERROR_RISK")) {
                        num4 = AnonymousClass006.A0C;
                    } else if (readString6.equals("PAYMENT_REQUEST_CANCELLED")) {
                        num4 = AnonymousClass006.A0N;
                    } else if (readString6.equals("USER_OPTIONALITY_SELECTION")) {
                        num4 = AnonymousClass006.A0Y;
                    } else {
                        throw C18190wL.A0a(readString6);
                    }
                }
                return new ErrorDialogContent(valueOf5, valueOf6, r11, r12, A0b8, A0b9, A0b10, num4, A0q2, readString5);
            case StringTreeSet.PAYLOAD_MASK:
                AnonymousClass69U valueOf8 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Class<APMButtonsItem> cls2 = APMButtonsItem.class;
                APMBloksNativeProps aPMBloksNativeProps = (APMBloksNativeProps) C18180wK.A0A(parcel2, cls2);
                if (parcel2.readInt() == 0) {
                    A0b7 = null;
                } else {
                    A0b7 = C86114wI.A0b(parcel2);
                }
                return new APMButtonsItem(aPMBloksNativeProps, valueOf8, (APMConfiguration) C18180wK.A0A(parcel2, cls2), A0b7);
            case 64:
                return new AnonCheckoutPuxLink((PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, AnonCheckoutPuxLink.class), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)));
            case 65:
                Class<AnonCheckoutToggleItem> cls3 = AnonCheckoutToggleItem.class;
                return new AnonCheckoutToggleItem((PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls3), (PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls3), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), C86104wH.A1W(parcel2));
            case 66:
                return new ConfirmationPaymentSectionItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 67:
                return new ConfirmationProductUpsellItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 68:
                return new ConfirmationProductUpsellSectionHeaderItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString());
            case 69:
                return new EmailOptInItem((PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, EmailOptInItem.class), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), C86104wH.A1W(parcel2));
            case LineChartView.MARGIN_TICKS /*70*/:
                return new InlineBackButtonItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString());
            case 71:
                return new InlineFormItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), (FormParams) C18180wK.A0A(parcel2, InlineFormItem.class), parcel2.readString());
            case Rfc3492Idn.initial_bias /*72*/:
                return new PayButtonItem((CurrencyAmount) C18180wK.A0A(parcel2, PayButtonItem.class), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), C86104wH.A1W(parcel2));
            case 73:
                AnonymousClass69U valueOf9 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Class<PuxAccordionItem> cls4 = PuxAccordionItem.class;
                AnonymousClass7Kx r112 = (AnonymousClass7Kx) C86114wI.A0e(parcel2, cls4);
                int readInt7 = parcel2.readInt();
                ArrayList A0k2 = C18240wQ.A0k(readInt7);
                for (int i3 = 0; i3 != readInt7; i3++) {
                    A0k2.add(C86114wI.A0e(parcel2, cls4));
                }
                return new PuxAccordionItem(valueOf9, (C108826j0) C86114wI.A0e(parcel2, cls4), r112, A0k2, C86104wH.A1W(parcel2));
            case 74:
                AnonymousClass69U valueOf10 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                String readString7 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = C969767l.valueOf(parcel2.readString());
                }
                return new PuxBannerItem(valueOf10, valueOf4, readString7);
            case 75:
                AnonymousClass69U valueOf11 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                if (parcel2.readInt() == 0) {
                    A0b6 = null;
                } else {
                    A0b6 = C86114wI.A0b(parcel2);
                }
                return new PuxContactItem(valueOf11, A0b6, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2));
            case 76:
                Class<PuxEntityItem> cls5 = PuxEntityItem.class;
                return new PuxEntityItem((CurrencyAmount) C18180wK.A0A(parcel2, cls5), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), (ItemDetails) C18180wK.A0A(parcel2, cls5), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 77:
                AnonymousClass69U valueOf12 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                FulfillmentOptionComponent fulfillmentOptionComponent = (FulfillmentOptionComponent) C18180wK.A0A(parcel2, PuxFulfillmentOptionItem.class);
                boolean z = false;
                boolean A1V = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() != 0) {
                    z = true;
                }
                Integer num5 = null;
                if (parcel2.readInt() == 0) {
                    A003 = null;
                } else {
                    A003 = C116886xi.A00(parcel2.readString());
                }
                if (parcel2.readInt() != 0) {
                    num5 = C116876xh.A00(parcel2.readString());
                }
                return new PuxFulfillmentOptionItem(valueOf12, fulfillmentOptionComponent, A003, num5, A1V, z);
            case 78:
                return new PuxIncentiveItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.createStringArrayList());
            case 79:
                Class<PuxOrderSummaryItem> cls6 = PuxOrderSummaryItem.class;
                return new PuxOrderSummaryItem((CurrencyAmount) C18180wK.A0A(parcel2, cls6), (CurrencyAmount) C18180wK.A0A(parcel2, cls6), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), parcel2.createStringArrayList(), parcel2.readInt(), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2));
            case 80:
                AnonymousClass69U valueOf13 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                PaymentMethod paymentMethod = (PaymentMethod) C18180wK.A0A(parcel2, PuxPaymentMethodItem.class);
                boolean A1W = C86104wH.A1W(parcel2);
                if (parcel2.readInt() == 0) {
                    A0b5 = null;
                } else {
                    A0b5 = C86114wI.A0b(parcel2);
                }
                return new PuxPaymentMethodItem(valueOf13, paymentMethod, A0b5, A1W, C86104wH.A1W(parcel2));
            case 81:
                AnonymousClass69U valueOf14 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer num6 = null;
                if (parcel2.readInt() == 0) {
                    A002 = null;
                } else {
                    A002 = C116886xi.A00(parcel2.readString());
                }
                if (parcel2.readInt() != 0) {
                    num6 = C116876xh.A00(parcel2.readString());
                }
                int readInt8 = parcel2.readInt();
                ArrayList A0k3 = C18240wQ.A0k(readInt8);
                for (int i4 = 0; i4 != readInt8; i4++) {
                    A0k3.add(C18180wK.A0A(parcel2, PuxPriceTableItem.class));
                }
                return new PuxPriceTableItem(valueOf14, A002, num6, A0k3);
            case 82:
                return new PuxPromoCodeItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), C86104wH.A1W(parcel2));
            case 83:
                return new PuxReceiverHeaderItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), parcel2.readString());
            case 84:
                return new PuxShippingAddressItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), (ShippingAddress) C18180wK.A0A(parcel2, PuxShippingAddressItem.class), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2));
            case 85:
                AnonymousClass69U valueOf15 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                String readString8 = parcel2.readString();
                Class<PuxTermsConditionItem> cls7 = PuxTermsConditionItem.class;
                PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl = (PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls7);
                String readString9 = parcel2.readString();
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2 = (PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls7);
                PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl3 = (PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls7);
                if (parcel2.readInt() == 0) {
                    A0k = null;
                } else {
                    int readInt9 = parcel2.readInt();
                    A0k = C18240wQ.A0k(readInt9);
                    for (int i5 = 0; i5 != readInt9; i5++) {
                        A0k.add(C86114wI.A0e(parcel2, cls7));
                    }
                }
                return new PuxTermsConditionItem(pAYLinkableTextFragmentImpl, pAYLinkableTextFragmentImpl2, pAYLinkableTextFragmentImpl3, (PAYLinkableTextFragmentImpl) C86114wI.A0e(parcel2, cls7), valueOf15, readString8, readString9, createStringArrayList, A0k);
            case 86:
                AnonymousClass69U valueOf16 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer num7 = null;
                if (parcel2.readInt() == 0) {
                    A0b4 = null;
                } else {
                    A0b4 = C86114wI.A0b(parcel2);
                }
                String readString10 = parcel2.readString();
                String readString11 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num7 = C86114wI.A0b(parcel2);
                }
                return new SelectionActionViewItem(valueOf16, A0b4, num7, readString10, readString11);
            case 87:
                AnonymousClass69U valueOf17 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer A005 = C116826xc.A00(parcel2.readString());
                String readString12 = parcel2.readString();
                String readString13 = parcel2.readString();
                String readString14 = parcel2.readString();
                boolean z2 = false;
                boolean A1V2 = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() != 0) {
                    z2 = true;
                }
                return new SelectionEmailViewItem(valueOf17, A005, readString12, readString13, readString14, parcel2.readString(), A1V2, z2);
            case 88:
                return new SelectionFulfillmentOptionItem((CurrencyAmount) C18180wK.A0A(parcel2, SelectionFulfillmentOptionItem.class), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), C116826xc.A00(parcel2.readString()), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 89:
                AnonymousClass69U valueOf18 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer A006 = C116826xc.A00(parcel2.readString());
                String readString15 = parcel2.readString();
                String readString16 = parcel2.readString();
                Class<SelectionFulfillmentPickupOptionItem> cls8 = SelectionFulfillmentPickupOptionItem.class;
                CurrencyAmount currencyAmount = (CurrencyAmount) C18180wK.A0A(parcel2, cls8);
                String readString17 = parcel2.readString();
                Date date = (Date) parcel2.readSerializable();
                Date date2 = (Date) parcel2.readSerializable();
                ShippingAddress shippingAddress = (ShippingAddress) C18180wK.A0A(parcel2, cls8);
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                return new SelectionFulfillmentPickupOptionItem(currencyAmount, (Distance) C18180wK.A0A(parcel2, cls8), valueOf18, shippingAddress, valueOf3, A006, readString15, readString16, readString17, date, date2, C86104wH.A1W(parcel2));
            case 90:
                return new SelectionFulfillmentShippingOptionItem((CurrencyAmount) C18180wK.A0A(parcel2, SelectionFulfillmentShippingOptionItem.class), AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), C116826xc.A00(parcel2.readString()), parcel2.readString(), parcel2.readString(), parcel2.readString(), (Date) parcel2.readSerializable(), (Date) parcel2.readSerializable());
            case 91:
                AnonymousClass69U valueOf19 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                String readString18 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A0b3 = null;
                } else {
                    A0b3 = C86114wI.A0b(parcel2);
                }
                String readString19 = parcel2.readString();
                if (readString19.equals("CREDENTIAL_TYPE_HEADER")) {
                    num = AnonymousClass006.A00;
                } else if (readString19.equals("SECTION_HEADER")) {
                    num = AnonymousClass006.A01;
                } else if (readString19.equals("ACCORDION_HEADER")) {
                    num = AnonymousClass006.A0C;
                } else if (readString19.equals("ACCORDION_HEADER_NO_RIGHT_ADDON")) {
                    num = AnonymousClass006.A0N;
                } else {
                    throw C18190wL.A0a(readString19);
                }
                return new SelectionHeaderItem(valueOf19, A0b3, num, readString18);
            case 92:
                return new SelectionNameViewItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), C116826xc.A00(parcel2.readString()), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 93:
                return new SelectionOfferViewItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2));
            case 94:
                AnonymousClass69U valueOf20 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer A007 = C116826xc.A00(parcel2.readString());
                String readString20 = parcel2.readString();
                String readString21 = parcel2.readString();
                String readString22 = parcel2.readString();
                Integer num8 = null;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = AnonymousClass67L.valueOf(parcel2.readString());
                }
                String readString23 = parcel2.readString();
                String readString24 = parcel2.readString();
                Class<SelectionPaymentMethodItem> cls9 = SelectionPaymentMethodItem.class;
                C148488rA r113 = (C148488rA) C86114wI.A0e(parcel2, cls9);
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = AnonymousClass69W.valueOf(parcel2.readString());
                }
                String readString25 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A0b2 = null;
                } else {
                    A0b2 = C86114wI.A0b(parcel2);
                }
                CardVerificationFieldsImpl cardVerificationFieldsImpl = (CardVerificationFieldsImpl) C86114wI.A0e(parcel2, cls9);
                C40307LcE valueOf21 = C40307LcE.valueOf(parcel2.readString());
                String readString26 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    num8 = C86114wI.A0b(parcel2);
                }
                return new SelectionPaymentMethodItem(cardVerificationFieldsImpl, valueOf20, r113, valueOf21, valueOf, valueOf2, A007, A0b2, num8, readString20, readString21, readString22, readString23, readString24, readString25, readString26, parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2));
            case 95:
                AnonymousClass69U valueOf22 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer A008 = C116826xc.A00(parcel2.readString());
                String readString27 = parcel2.readString();
                String readString28 = parcel2.readString();
                String readString29 = parcel2.readString();
                boolean z3 = false;
                boolean A1V3 = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() != 0) {
                    z3 = true;
                }
                return new SelectionPhoneNumberViewItem(valueOf22, A008, readString27, readString28, readString29, parcel2.readString(), A1V3, z3);
            case 96:
                return new SelectionPromoCodeViewItem(AnonymousClass69U.valueOf(C86104wH.A0q(parcel2)), parcel2.readString());
            case 97:
                AnonymousClass69U valueOf23 = AnonymousClass69U.valueOf(C86104wH.A0q(parcel2));
                Integer A009 = C116826xc.A00(parcel2.readString());
                String readString30 = parcel2.readString();
                String readString31 = parcel2.readString();
                String readString32 = parcel2.readString();
                String readString33 = parcel2.readString();
                String readString34 = parcel2.readString();
                String readString35 = parcel2.readString();
                String readString36 = parcel2.readString();
                String readString37 = parcel2.readString();
                String readString38 = parcel2.readString();
                String readString39 = parcel2.readString();
                String readString40 = parcel2.readString();
                String readString41 = parcel2.readString();
                ArrayList arrayList = null;
                if (parcel2.readInt() == 0) {
                    A0b = null;
                } else {
                    A0b = C86114wI.A0b(parcel2);
                }
                String readString42 = parcel2.readString();
                boolean A1W2 = C86104wH.A1W(parcel2);
                String readString43 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    int readInt10 = parcel2.readInt();
                    arrayList = C18240wQ.A0k(readInt10);
                    for (int i6 = 0; i6 != readInt10; i6++) {
                        arrayList.add(C972568q.valueOf(parcel2.readString()));
                    }
                }
                return new SelectionShippingAddressItem(valueOf23, A009, A0b, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, readString42, readString43, arrayList, A1W2);
            case 98:
                String A0q3 = C86104wH.A0q(parcel2);
                String readString44 = parcel2.readString();
                String readString45 = parcel2.readString();
                String readString46 = parcel2.readString();
                String readString47 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ECPConfirmationUpsellSection.CREATOR.createFromParcel(parcel2);
                }
                return new ECPConfirmationParams((ECPConfirmationUpsellSection) createFromParcel, A0q3, readString44, readString45, readString46, readString47, parcel2.readString());
            default:
                return new ECPConfirmationUpsellAction(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new LoginClient$Result[i];
            case 1:
                return new MapOptions[i];
            case 2:
                return new OneTimeCodeDevice[i];
            case 3:
                return new DirectInstallDownloadEvent[i];
            case 4:
                return new TreeParcelable[i];
            case 5:
                return new ZonedValue[i];
            case 6:
                return new ZonePolicy[i];
            case 7:
                return new BugReportFile[i];
            case 8:
                return new ParcelableSensorEventClone[i];
            case 9:
                return new DefaultEvidenceRecorderProvider[i];
            case 10:
                return new SelfieEvidence[i];
            case 11:
                return new ChallengeProvider[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new IgVoltronAndNmlModulesDownloader[i];
            case 13:
                return new IdCaptureConfig[i];
            case 14:
                return new SelfieCaptureConfig[i];
            case 15:
                return new IgSmartCaptureLoggerProvider[i];
            case 16:
                return new ResolvedConsentTextsProvider[i];
            case 19:
                return new EmojiSet[i];
            case 20:
                return new EmojiSet.Metadata[i];
            case 21:
                return new PlayerOrigin[i];
            case 22:
                return new AbrContextualSetting[i];
            case 23:
                return new AudioFocusLossSettings[i];
            case 24:
                return new DeviceOrientationFrame[i];
            case 25:
                return new DynamicPlayerSettings[i];
            case Rfc3492Idn.tmax /*26*/:
                return new FirstDataSegmentCacheCheckEndEvent[i];
            case 27:
                return new FirstDataSegmentCacheCheckStartEvent[i];
            case 28:
                return new HeroScrollSetting[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new HttpTransferRequestedEvent[i];
            case 30:
                return new HttpTransferStartEvent[i];
            case 31:
                return new InitSegmentCacheCheckEndEvent[i];
            case 32:
                return new InitSegmentCacheCheckStartEvent[i];
            case 33:
                return new LatencyMeasureLiveTraceFrame[i];
            case 34:
                return new LiveState[i];
            case 35:
                return new ParcelableCue[i];
            case Rfc3492Idn.base /*36*/:
                return new ParcelableFormat[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new ParcelableTimeRange[i];
            case Rfc3492Idn.skew /*38*/:
                return new PrefetchTaskDataFetchIssuedEvent[i];
            case 39:
                return new PrefetchTaskQueueCompleteEvent[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new PrefetchTaskQueueExitEvent[i];
            case Seq.NULL_REFNUM /*41*/:
                return new PrefetchTaskQueueStartEvent[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new ServicePlayerState[i];
            case 43:
                return new SpatialAudioFocusParams[i];
            case 44:
                return new VideoFrameMetadata[i];
            case 45:
                return new VideoMemoryState[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new VideoPlayContextualSetting[i];
            case 47:
                return new VideoPlayRequest[i];
            case 48:
                return new VideoPrefetchRequest[i];
            case 49:
                return new VideoProtocolProps[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new VideoSource[i];
            case 51:
                return new SphericalMetadata[i];
            case 52:
                return new Call[i];
            case 53:
                return new CallIntent[i];
            case 54:
                return new DisconnectIntent[i];
            case 55:
                return new Participant[i];
            case 56:
                return new ThreadInfo[i];
            case 57:
                return new ParcelableWifiScanResult[i];
            case 58:
                return new Capabilities[i];
            case 59:
                return new APMBloksNativeProps[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new CurrencyAmount[i];
            case 61:
                return new Distance[i];
            case 62:
                return new ErrorDialogContent[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new APMButtonsItem[i];
            case 64:
                return new AnonCheckoutPuxLink[i];
            case 65:
                return new AnonCheckoutToggleItem[i];
            case 66:
                return new ConfirmationPaymentSectionItem[i];
            case 67:
                return new ConfirmationProductUpsellItem[i];
            case 68:
                return new ConfirmationProductUpsellSectionHeaderItem[i];
            case 69:
                return new EmailOptInItem[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new InlineBackButtonItem[i];
            case 71:
                return new InlineFormItem[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new PayButtonItem[i];
            case 73:
                return new PuxAccordionItem[i];
            case 74:
                return new PuxBannerItem[i];
            case 75:
                return new PuxContactItem[i];
            case 76:
                return new PuxEntityItem[i];
            case 77:
                return new PuxFulfillmentOptionItem[i];
            case 78:
                return new PuxIncentiveItem[i];
            case 79:
                return new PuxOrderSummaryItem[i];
            case 80:
                return new PuxPaymentMethodItem[i];
            case 81:
                return new PuxPriceTableItem[i];
            case 82:
                return new PuxPromoCodeItem[i];
            case 83:
                return new PuxReceiverHeaderItem[i];
            case 84:
                return new PuxShippingAddressItem[i];
            case 85:
                return new PuxTermsConditionItem[i];
            case 86:
                return new SelectionActionViewItem[i];
            case 87:
                return new SelectionEmailViewItem[i];
            case 88:
                return new SelectionFulfillmentOptionItem[i];
            case 89:
                return new SelectionFulfillmentPickupOptionItem[i];
            case 90:
                return new SelectionFulfillmentShippingOptionItem[i];
            case 91:
                return new SelectionHeaderItem[i];
            case 92:
                return new SelectionNameViewItem[i];
            case 93:
                return new SelectionOfferViewItem[i];
            case 94:
                return new SelectionPaymentMethodItem[i];
            case 95:
                return new SelectionPhoneNumberViewItem[i];
            case 96:
                return new SelectionPromoCodeViewItem[i];
            case 97:
                return new SelectionShippingAddressItem[i];
            case 98:
                return new ECPConfirmationParams[i];
            case 99:
                return new ECPConfirmationUpsellAction[i];
            default:
                return new Emoji[i];
        }
    }
}
