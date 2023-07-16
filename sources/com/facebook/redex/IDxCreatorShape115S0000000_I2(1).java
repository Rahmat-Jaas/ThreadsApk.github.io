package com.facebook.redex;

import X.C04220Ms;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.FragmentTabHost$SavedState;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.instagram.actionbar.ActionButton;
import com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.react.modules.base.IgReactQEModule;

public class IDxCreatorShape115S0000000_I2 implements Parcelable.Creator {
    public final int A00;

    public IDxCreatorShape115S0000000_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new ActivityResult(parcel);
            case 1:
                C04220Ms.A0B(parcel, 0);
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                C04220Ms.A0A(readParcelable);
                return new IntentSenderRequest((Intent) parcel.readParcelable(Intent.class.getClassLoader()), (IntentSender) readParcelable, parcel.readInt(), parcel.readInt());
            case 2:
                return new BackStackRecordState(parcel);
            case 3:
                return new BackStackState(parcel);
            case 4:
                return new FragmentManager$LaunchedFragmentInfo(parcel);
            case 5:
                return new FragmentManagerState(parcel);
            case 6:
                return new FragmentState(parcel);
            case 7:
                return new FragmentTabHost$SavedState(parcel);
            case 8:
                return new BrowserLiteJSBridgeProxy(parcel);
            case 9:
                return new AutofillData(parcel);
            case 10:
                return new TraceConfigExtras(parcel);
            case 11:
                return new TraceContext(parcel);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new FbnsAIDLRequest(parcel);
            case 13:
                return new FbnsAIDLResult(parcel);
            case 14:
                return new GqlsTopicExtraInfo(parcel);
            case 15:
                return new SubscribeTopic(parcel);
            case 16:
                return new ActionButton.SavedState(parcel);
            case LangUtils.HASH_SEED /*17*/:
                C04220Ms.A0B(parcel, 0);
                return new IgFaceTrackerModelsProvider(parcel);
            case 18:
                return new AnalyticsEventEntry(parcel);
            default:
                C04220Ms.A0B(parcel, 0);
                BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(0, 0);
                backgroundGradientColors.A01 = parcel.readInt();
                backgroundGradientColors.A00 = parcel.readInt();
                return backgroundGradientColors;
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ActivityResult[i];
            case 1:
                return new IntentSenderRequest[i];
            case 2:
                return new BackStackRecordState[i];
            case 3:
                return new BackStackState[i];
            case 4:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 5:
                return new FragmentManagerState[i];
            case 6:
                return new FragmentState[i];
            case 7:
                return new FragmentTabHost$SavedState[i];
            case 8:
                return new BrowserLiteJSBridgeProxy[i];
            case 9:
                return new AutofillData[i];
            case 10:
                return new TraceConfigExtras[i];
            case 11:
                return new TraceContext[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new FbnsAIDLRequest[i];
            case 13:
                return new FbnsAIDLResult[i];
            case 14:
                return new GqlsTopicExtraInfo[i];
            case 15:
                return new SubscribeTopic[i];
            case 16:
                return new ActionButton.SavedState[i];
            case LangUtils.HASH_SEED /*17*/:
                return new IgFaceTrackerModelsProvider[i];
            case 18:
                return new AnalyticsEventEntry[i];
            default:
                return new BackgroundGradientColors[i];
        }
    }
}
