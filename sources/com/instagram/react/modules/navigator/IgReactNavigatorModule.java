package com.instagram.react.modules.navigator;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u1;
import X.AnonymousClass71V;
import X.AnonymousClass7CL;
import X.AnonymousClass7Ko;
import X.AnonymousClass7oY;
import X.AnonymousClass80D;
import X.AnonymousClass80E;
import X.AnonymousClass830;
import X.AnonymousClass831;
import X.AnonymousClass836;
import X.AnonymousClass83B;
import X.C10300i6;
import X.C1361781s;
import X.C1361881t;
import X.C1361981u;
import X.C1362782c;
import X.C18250wR;
import X.C34611Ibh;
import X.C39741Kz6;
import X.C63343hJ;
import X.C71494Ja;
import X.C86114wI;
import X.I03;
import X.IPD;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreact.specs.NativeNavigationSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.smartcapture.logging.SCEventNames;
import com.instagram.barcelona.R;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

@ReactModule(name = "Navigation", needsEagerInit = true)
public class IgReactNavigatorModule extends NativeNavigationSpec implements C39741Kz6 {
    public static final String MODULE_NAME = "Navigation";
    public static final String URL = "url";
    public View mCustomActionBarView;
    public boolean mIsHostResumed;
    public Map mRoutesMap;
    public final C10300i6 mSession;

    public void clearRightBarButton(double d) {
    }

    public String getName() {
        return "Navigation";
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsHostResumed = false;
    }

    public void onHostResume() {
        this.mIsHostResumed = true;
    }

    public void reloadReact() {
    }

    public static AnonymousClass4u1 configureReactNativeLauncherWithRouteInfo(AnonymousClass4u1 r4, Bundle bundle, ReadableMap readableMap) {
        if (bundle != null) {
            AnonymousClass71V.A01(bundle, readableMap);
            String string = bundle.getString(DialogModule.KEY_TITLE, (String) null);
            boolean z = false;
            boolean z2 = bundle.getBoolean("logoAsTitle", false);
            if (string == null || !z2) {
                z = true;
            }
            AnonymousClass7Ko.A0D(z, "Screen navigationOptions cannot have both 'title' and 'logoAsTitle'");
            C71494Ja r2 = (C71494Ja) r4;
            r2.A07 = string;
            r2.A0A = z2;
            if (bundle.containsKey("orientation")) {
                r2.A00 = bundle.getInt("orientation");
            }
            if (bundle.containsKey("analyticsModule")) {
                r2.A03 = bundle.getString("analyticsModule");
            }
            if (bundle.containsKey("perfLogger_ttiEventName")) {
                r2.A06 = bundle.getString("perfLogger_ttiEventName");
            }
            if (bundle.containsKey("fb_analyticsExtras")) {
                r2.A01 = new AnonymousClass7oY(bundle, readableMap);
            }
            if (bundle.containsKey("navigationBar")) {
                r2.A09 = !bundle.getBoolean("navigationBar");
            }
        }
        return r4;
    }

    public static int contentDescriptionForIconType(String str) {
        if (str.equals("done")) {
            return 2131826219;
        }
        if (str.equals(SCEventNames.Params.STEP_CHANGE_NEXT)) {
            return 2131831737;
        }
        if (str.equals("reload")) {
            return 2131834537;
        }
        if (str.equals("cancel")) {
            return 2131823054;
        }
        if (str.equals("back")) {
            return 2131821803;
        }
        if (str.equals("more")) {
            return 2131830699;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.string.f0nameremoved;
        }
        if (str.equals("lock")) {
            return 2131830098;
        }
        if (str.equals("loading")) {
            return 2131830080;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 2131822800;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("Unsupported IconType: ", str));
    }

    public static int resourceForIconType(String str) {
        if (str.equals("done")) {
            return R.drawable.instagram_check_pano_outline_24;
        }
        if (str.equals(SCEventNames.Params.STEP_CHANGE_NEXT)) {
            return R.drawable.nav_arrow_next;
        }
        if (str.equals("reload")) {
            return R.drawable.instagram_arrow_cw_pano_outline_24;
        }
        if (str.equals("cancel")) {
            return R.drawable.instagram_x_pano_outline_24;
        }
        if (str.equals("back")) {
            return R.drawable.instagram_arrow_back_24;
        }
        if (str.equals("more")) {
            return R.drawable.instagram_more_vertical_pano_outline_24;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.drawable.instagram_direct_pano_outline_24;
        }
        if (str.equals("lock")) {
            return R.drawable.instagram_lock_filled_12;
        }
        if (str.equals("loading") || str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 0;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("Unsupported IconType: ", str));
    }

    public void dismiss(double d, ReadableMap readableMap) {
        AnonymousClass7CL.A00(new AnonymousClass80E(this));
    }

    public void navigate(double d, String str, ReadableMap readableMap) {
        FragmentActivity fragmentActivity;
        I03 fromBundle;
        AnonymousClass4u1 createReactNativeLauncherFromRouteName;
        if (str.equals("IgExternalUrlRoute")) {
            openURL(readableMap);
        }
        Map map = this.mRoutesMap;
        if (map != null && map.get(str) != null) {
            Activity currentActivity = getCurrentActivity();
            if ((currentActivity instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) currentActivity) != null) {
                Bundle bundle = ((Bundle) this.mRoutesMap.get(str)).getBundle("navigationOptions");
                if (bundle == null) {
                    fromBundle = null;
                } else {
                    fromBundle = Arguments.fromBundle(bundle);
                }
                boolean containsKey = ((BaseBundle) this.mRoutesMap.get(str)).containsKey("isFromRegistry");
                C10300i6 r0 = this.mSession;
                if (containsKey) {
                    createReactNativeLauncherFromRouteName = createReactNativeLauncherFromAppKey(r0, str, readableMap, fromBundle);
                } else {
                    createReactNativeLauncherFromRouteName = createReactNativeLauncherFromRouteName(r0, str, readableMap, fromBundle);
                }
                AnonymousClass7CL.A00(new AnonymousClass836(fragmentActivity, fromBundle, createReactNativeLauncherFromRouteName, this, d));
            }
        }
    }

    public void openURL(double d, String str) {
        AnonymousClass7CL.A00(new C1361781s(this, str));
    }

    public void pop(double d) {
        AnonymousClass7CL.A00(new AnonymousClass80D(this));
    }

    public void popToScreen(double d, double d2) {
        AnonymousClass7CL.A00(new C1361981u(this, d2));
    }

    public void setBarLeftAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        if (readableMap.hasKey("icon")) {
            if (readableMap.hasKey("icon")) {
                str = readableMap.getString("icon");
                if (str != null) {
                    i = resourceForIconType(str);
                }
                i = 0;
            } else {
                str = null;
                i = 0;
            }
            AnonymousClass7CL.A00(new AnonymousClass830(this, str, d, i));
        }
    }

    public void setBarPrimaryAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        ReadableMap readableMap2 = readableMap;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (!readableMap.hasKey("icon") || (str2 = readableMap.getString("icon")) == null) {
            i = 0;
        } else {
            i = resourceForIconType(str2);
        }
        AnonymousClass7CL.A00(new AnonymousClass83B(readableMap2, this, str, str2, d, i));
    }

    public void setBarTitle(double d, String str) {
        AnonymousClass7CL.A00(new C1362782c(this, str, d));
    }

    public void setBarTitleWithConfig(double d, ReadableMap readableMap) {
        String str;
        int i;
        FragmentActivity fragmentActivity;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (!readableMap.hasKey("icon") || (str2 = readableMap.getString("icon")) == null) {
            i = 0;
        } else {
            i = resourceForIconType(str2);
        }
        if (str == null) {
            if (i == 0) {
                return;
            }
        } else if (i == 0) {
            setBarTitle(d, str);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (!(currentActivity instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) currentActivity;
        }
        AnonymousClass7CL.A00(new AnonymousClass831(fragmentActivity, this, str, str2));
    }

    public IgReactNavigatorModule(IPD ipd, C10300i6 r5) {
        super(ipd);
        this.mSession = r5;
        ipd.A07(this);
        try {
            IPD reactApplicationContext = getReactApplicationContext();
            this.mRoutesMap = AnonymousClass71V.A00(reactApplicationContext, reactApplicationContext.getAssets().open("react_native_routes.json"));
        } catch (IOException unused) {
        }
    }

    private AnonymousClass4u1 createReactNativeLauncherFromAppKey(C10300i6 r4, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        C63343hJ.getInstance();
        C71494Ja r1 = new C71494Ja(r4, str);
        r1.Cod(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(r1, bundle, readableMap);
        return r1;
    }

    private AnonymousClass4u1 createReactNativeLauncherFromRouteName(C10300i6 r4, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        C63343hJ.getInstance();
        C71494Ja r1 = new C71494Ja(r4);
        r1.CpK(str);
        r1.Cod(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(r1, bundle, readableMap);
        return r1;
    }

    private Map createRouteMapFromJson(String str) {
        try {
            return AnonymousClass71V.A00(getReactApplicationContext(), new ByteArrayInputStream(str.getBytes()));
        } catch (IOException e) {
            AnonymousClass0LU.A0H("ReactNative", "Failed to create routes map.", e);
            throw C86114wI.A0k(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getSavedInstanceState(double r5, java.lang.String r7, com.facebook.react.bridge.Callback r8) {
        /*
            r4 = this;
            android.app.Activity r1 = r4.getCurrentActivity()
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 != 0) goto L_0x0038
            r1 = 0
        L_0x0009:
            r3 = 0
            if (r1 == 0) goto L_0x001b
            X.0m7 r0 = r1.getSupportFragmentManager()
            androidx.fragment.app.Fragment r1 = r0.A0O(r7)
            boolean r0 = r1 instanceof X.C34611Ibh
            if (r0 == 0) goto L_0x001b
            r3 = r1
            X.Ibh r3 = (X.C34611Ibh) r3
        L_0x001b:
            r1 = 1
            r2 = 0
            if (r3 == 0) goto L_0x0031
            X.ImK r0 = r3.A00
            com.instagram.react.delegate.IgReactDelegate r0 = (com.instagram.react.delegate.IgReactDelegate) r0
            android.os.Bundle r0 = r0.A01
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.I03 r0 = com.facebook.react.bridge.Arguments.fromBundle(r0)
        L_0x002b:
            r1[r2] = r0
            r8.invoke(r1)
            return
        L_0x0031:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x002b
        L_0x0038:
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.navigator.IgReactNavigatorModule.getSavedInstanceState(double, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    public Map getTypedExportedConstants() {
        return AnonymousClass0wJ.A0y();
    }

    public void setInstanceStateToSave(double d, String str, ReadableMap readableMap) {
        FragmentActivity fragmentActivity;
        C34611Ibh ibh;
        Bundle bundle = Arguments.toBundle(readableMap);
        Activity currentActivity = getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) currentActivity) != null) {
            Fragment A0O = fragmentActivity.getSupportFragmentManager().A0O(str);
            if ((A0O instanceof C34611Ibh) && (ibh = (C34611Ibh) A0O) != null) {
                ((IgReactDelegate) ibh.A00).A01.putAll(bundle);
            }
        }
    }

    public void updateNativeRoutesConfiguration(String str) {
        this.mRoutesMap = createRouteMapFromJson(str);
    }

    private void openURL(ReadableMap readableMap) {
        String string = readableMap.getString("url");
        string.getClass();
        AnonymousClass7CL.A00(new C1361881t(this, string));
    }
}
