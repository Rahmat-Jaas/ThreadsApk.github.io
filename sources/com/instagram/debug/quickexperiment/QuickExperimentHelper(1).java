package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0TN;
import X.AnonymousClass0e5;
import X.AnonymousClass0wJ;
import X.AnonymousClass3GH;
import X.AnonymousClass3IC;
import X.AnonymousClass3LY;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C05050Qq;
import X.C07810cE;
import X.C07940cT;
import X.C07950cU;
import X.C08960ea;
import X.C09120et;
import X.C10070hg;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18250wR;
import X.C305221q;
import X.C34727Idy;
import X.C40290Lbt;
import X.C61823Vx;
import X.C62993bH;
import X.C63173fJ;
import X.C63273h9;
import X.C63613hu;
import X.C63803iN;
import X.C63813iO;
import X.C67603zp;
import X.I17;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment;
import com.instagram.debug.devoptions.refresh.AppRestartUtil;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class QuickExperimentHelper {
    public static final double ALMOST_LOADED_NAMES_RATIO = 0.9d;
    public static final Object PARAMS_MAP_CACHE_LOCK = new Object();
    public static final String TAG = "QuickExperimentHelper";
    public static List mCachedExperimentParameters;
    public static AnonymousClass3IC mCachedParamsMap;

    public static AnonymousClass4MA createSimpleMenuItem(Context context, C10300i6 r9, C07950cU r10, QuickExperimentDebugStore quickExperimentDebugStore, C34727Idy idy) {
        AnonymousClass4MA A01 = AnonymousClass4MA.A01((View.OnClickListener) null, getLabel(r9, r10, quickExperimentDebugStore));
        Context context2 = context;
        A01.A03 = new QuickExperimentHelper$$ExternalSyntheticLambda3(context2, r9, r10, r10.mUniverseName, r10.mName, A01, quickExperimentDebugStore, idy);
        return A01;
    }

    public static AnonymousClass4MC createSwitchItem(C10300i6 r7, C07950cU r8, QuickExperimentDebugStore quickExperimentDebugStore, C34727Idy idy) {
        C07950cU r5 = r8;
        String str = r8.mUniverseName;
        C10300i6 r82 = r7;
        AnonymousClass4MC r72 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) null, (CharSequence) getLabel(r7, r5, quickExperimentDebugStore), AnonymousClass0wJ.A1X(peek(r7, r5).value));
        QuickExperimentHelper$$ExternalSyntheticLambda6 quickExperimentHelper$$ExternalSyntheticLambda6 = new QuickExperimentHelper$$ExternalSyntheticLambda6(r5, quickExperimentDebugStore, r72, r82, idy);
        QuickExperimentHelper$$ExternalSyntheticLambda5 quickExperimentHelper$$ExternalSyntheticLambda5 = new QuickExperimentHelper$$ExternalSyntheticLambda5(str);
        r72.A08 = quickExperimentHelper$$ExternalSyntheticLambda6;
        r72.A07 = quickExperimentHelper$$ExternalSyntheticLambda5;
        return r72;
    }

    public static /* synthetic */ boolean lambda$createSwitchItem$2(String str, View view) {
        if (view != null) {
            Context context = view.getContext();
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                C18250wR.A0n(clipboardManager, "QE Universe Name", str);
                C63813iO.A01(context, AnonymousClass00U.A0L(I17.A00(386), str));
            }
        }
        return true;
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$1  reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource;
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005a */
        static {
            /*
                X.21q[] r0 = X.C305221q.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = r2
                r5 = 1
                r2[r5] = r5     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r4 = 2
                r0 = 0
                r2[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r3 = 3
                r2[r3] = r3     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                r1 = 4
                r2[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                X.0TN[] r0 = X.AnonymousClass0TN.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource = r2
                X.0TN r0 = X.AnonymousClass0TN.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r2[r0] = r5     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                X.0TN r0 = X.AnonymousClass0TN.SERVER     // Catch:{ NoSuchFieldError -> 0x002f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r2[r0] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                X.0TN r0 = X.AnonymousClass0TN.OVERRIDE     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                X.0TN r0 = X.AnonymousClass0TN.DEFAULT__ACCESSED_BEFORE_MC_INIT     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                X.0TN r0 = X.AnonymousClass0TN.DEFAULT__ACCESSED_AFTER_MC_DISPOSE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                X.0TN r0 = X.AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                X.0TN r0 = X.AnonymousClass0TN.DEFAULT__NO_DATA_ON_DISK     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                X.0TN r0 = X.AnonymousClass0TN.DEFAULT__MISSING_SERVER_VALUE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0 = 8
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.AnonymousClass1.<clinit>():void");
        }
    }

    public class ValueAndSource {
        public final Object defaultValue;
        public final Object latestValue;
        public final Object value;
        public final AnonymousClass0TN valueSource;

        public ValueAndSource(Object obj, Object obj2, Object obj3, AnonymousClass0TN r4) {
            this.value = obj;
            this.latestValue = obj2;
            this.defaultValue = obj3;
            this.valueSource = r4;
        }
    }

    public static List getAllExperiments() {
        ArrayList arrayList;
        synchronized (PARAMS_MAP_CACHE_LOCK) {
            List list = mCachedExperimentParameters;
            arrayList = list;
            if (list == null) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                AnonymousClass3IC paramsMap = getParamsMap();
                arrayList = A0v;
                if (paramsMap != null) {
                    for (AnonymousClass3GH createExperimentParameterFromParamsMapEntry : paramsMap.A03) {
                        A0v.add(createExperimentParameterFromParamsMapEntry(createExperimentParameterFromParamsMapEntry));
                    }
                    arrayList = A0v;
                    if (mCachedParamsMap != null) {
                        mCachedExperimentParameters = A0v;
                        arrayList = A0v;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        X.AnonymousClass0LU.A0L(TAG, "Failed to get category with specifier:%d", r3, X.C18240wQ.A1b(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        return X.C40290Lbt.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        throw new X.AnonymousClass0Tc(java.lang.String.format("Unknown unitType(%d) or configIndex(%d) from specifier (%d)", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r3), java.lang.Long.valueOf(r4)}));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C40290Lbt getCategory(X.C07950cU r7) {
        /*
            long r4 = r7.mMobileConfigSpecifier
            r0 = 32
            long r6 = r4 >>> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r6 = r6 & r0
            int r3 = (int) r6
            r0 = 54
            long r6 = r4 >>> r0
            r0 = 63
            long r6 = r6 & r0
            int r2 = (int) r6
            r0 = 3
            if (r2 >= r0) goto L_0x0017
            r2 = 1
        L_0x0017:
            int[][] r0 = X.C40582LjJ.A01     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            r0 = r0[r2]     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            r1 = r0[r3]     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            java.util.Map r0 = X.C40290Lbt.A02     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            java.lang.Object r0 = X.C18200wM.A0f(r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            X.Lbt r0 = (X.C40290Lbt) r0     // Catch:{ IndexOutOfBoundsException -> 0x002a }
            if (r0 != 0) goto L_0x0029
            X.Lbt r0 = X.C40290Lbt.A0T     // Catch:{ IndexOutOfBoundsException -> 0x002a }
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 0Tc -> 0x0046 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ 0Tc -> 0x0046 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ 0Tc -> 0x0046 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}     // Catch:{ 0Tc -> 0x0046 }
            java.lang.String r0 = "Unknown unitType(%d) or configIndex(%d) from specifier (%d)"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ 0Tc -> 0x0046 }
            X.0Tc r0 = new X.0Tc     // Catch:{ 0Tc -> 0x0046 }
            r0.<init>(r1)     // Catch:{ 0Tc -> 0x0046 }
            throw r0     // Catch:{ 0Tc -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            java.lang.Object[] r2 = X.C18240wQ.A1b(r4)
            java.lang.String r1 = "QuickExperimentHelper"
            java.lang.String r0 = "Failed to get category with specifier:%d"
            X.AnonymousClass0LU.A0L(r1, r0, r3, r2)
            X.Lbt r0 = X.C40290Lbt.A0T
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.getCategory(X.0cU):X.Lbt");
    }

    public static C67603zp getDeviceSessionMobileConfig() {
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A03().A01.A00;
    }

    public static C10070hg getForceQESyncCallback(Context context, Boolean bool) {
        return new QuickExperimentHelper$$ExternalSyntheticLambda7(context, bool);
    }

    public static int getInputType(C07950cU r2) {
        int A01 = C18190wL.A01(r2.mMobileConfigSpecifier);
        if (A01 == 2) {
            return 4098;
        }
        if (A01 == 4) {
            return ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
        }
        return 1;
    }

    public static double getNamedParamsRatio(AnonymousClass3IC r4) {
        List<AnonymousClass3GH> list = r4.A03;
        int i = 0;
        for (AnonymousClass3GH r1 : list) {
            if (C62993bH.A03(r1.A00) && C62993bH.A03(r1.A01)) {
                i++;
            }
        }
        return ((double) i) / ((double) list.size());
    }

    public static String getNiceUniverseName(String str) {
        return str.replaceAll("^(ig_|android_|launcher_)+", "").replaceAll("(_launcher|_universe)$", "").replace("_", " ");
    }

    public static AnonymousClass3IC getParamsMap(C67603zp r0, boolean z) {
        if (z) {
            r0.A0B();
        }
        return r0.A09();
    }

    public static Dialog getSimpleDialog(Context context, C10300i6 r10, C07950cU r11, String str, String str2, AnonymousClass4MA r14, QuickExperimentDebugStore quickExperimentDebugStore, C34727Idy idy) {
        EditText editText = new EditText(context);
        editText.setInputType(getInputType(r11));
        C10300i6 r8 = r10;
        editText.setText(String.valueOf(peek(r10, r11).value));
        AnonymousClass4MA r7 = r14;
        QuickExperimentDebugStore quickExperimentDebugStore2 = quickExperimentDebugStore;
        C34727Idy idy2 = idy;
        return new AlertDialog.Builder(context).setTitle(r11.mUniverseName).setMessage(AnonymousClass00U.A0V("Override ", r11.mName, ":")).setView(editText).setPositiveButton(IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, new QuickExperimentHelper$$ExternalSyntheticLambda0(r11, editText, quickExperimentDebugStore2, r7, r8, idy2)).setNeutralButton("Client Default", new QuickExperimentHelper$$ExternalSyntheticLambda1(r11, quickExperimentDebugStore, r14, r8, idy2)).setNegativeButton("No Override", new QuickExperimentHelper$$ExternalSyntheticLambda2(r11, quickExperimentDebugStore2, r7, r8, idy2)).create();
    }

    public static C07950cU createExperimentParameterFromParamsMapEntry(AnonymousClass3GH r7) {
        long A00 = r7.A00();
        int i = r7.A08;
        String str = r7.A01;
        if (str.isEmpty()) {
            str = AnonymousClass00U.A0L("_", String.valueOf(r7.A04));
        }
        String str2 = r7.A00;
        if (str2.isEmpty()) {
            str2 = AnonymousClass00U.A0L("_", String.valueOf(r7.A03));
        }
        if (i == 2) {
            return new AnonymousClass0e5(str, str2, A00);
        }
        return new C08960ea(str, str2, A00);
    }

    public static void forceUserQESync(Context context, C61823Vx r3, UserSession userSession, C10070hg r5) {
        int i;
        if (C09120et.A02().A0M() || C09120et.A02().A0N()) {
            i = 2131825563;
        } else {
            if (C09120et.A02().A0O()) {
                i = 2131825006;
            }
            r3.A09(userSession, true);
            r3.A02(userSession, C07940cT.User).A00(r5);
            AnonymousClass3LY.A00(userSession).CWx(DevOptionsRefreshEvent.INSTANCE);
        }
        C63813iO.A0A(context, i, 1);
        r3.A09(userSession, true);
        r3.A02(userSession, C07940cT.User).A00(r5);
        AnonymousClass3LY.A00(userSession).CWx(DevOptionsRefreshEvent.INSTANCE);
    }

    public static String getLabel(C10300i6 r5, C07950cU r6, QuickExperimentDebugStore quickExperimentDebugStore) {
        String str;
        Object obj;
        Object obj2;
        ValueAndSource peek = peek(r5, r6);
        AnonymousClass0TN r4 = peek.valueSource;
        switch (r4.ordinal()) {
            case 0:
                str = "unknown";
                break;
            case 1:
                str = "server";
                break;
            case 2:
                str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
                break;
            case 3:
                str = "default[null server value]";
                break;
            case 4:
                str = "default[before mc init]";
                break;
            case 5:
                str = "default[no data]";
                break;
            case 6:
                str = "default[after mc dispose]";
                break;
            case 7:
                str = "default[missing server value]";
                break;
            default:
                str = AnonymousClass00U.A0S("ValueSource[", "]", r4.A00);
                break;
        }
        if ((r4 == AnonymousClass0TN.SERVER || r4 == AnonymousClass0TN.OVERRIDE) && ((obj = peek.value) == (obj2 = peek.defaultValue) || (obj != null && obj.equals(obj2)))) {
            str = AnonymousClass00U.A0L(str, ",default");
        }
        Object obj3 = peek.value;
        Object obj4 = peek.latestValue;
        if (obj3 == obj4 || (obj3 != null && obj3.equals(obj4))) {
            str = AnonymousClass00U.A0L(str, ",latest");
        }
        return AnonymousClass00U.A0i(r6.mName.replace("_", " "), " = ", peek.value.toString(), "\n(", str, ")");
    }

    public static List getOverriddenExperimentParameters(QuickExperimentDebugStore quickExperimentDebugStore) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C07950cU r1 : getAllExperiments()) {
            if (quickExperimentDebugStore.isParameterOverridden(r1)) {
                A0v.add(r1);
            }
        }
        return A0v;
    }

    public static /* synthetic */ void lambda$createSwitchItem$1(C07950cU r1, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass4MC r3, C10300i6 r4, C34727Idy idy, CompoundButton compoundButton, boolean z) {
        RecentQuickExperimentManager.markRecentExperimentParameter(r1);
        quickExperimentDebugStore.putOverriddenParameter(r1, String.valueOf(z));
        r3.A0B = getLabel(r4, r1, quickExperimentDebugStore);
        idy.notifyDataSetChanged();
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$7(C305221q r1, Context context, Boolean bool) {
        String str;
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            str = "Network Error";
        } else if (ordinal == 0) {
            str = "Did not sync";
        } else if (ordinal == 3) {
            str = "Fetched latest launcher values; nothing updated";
        } else if (ordinal != 2) {
            return;
        } else {
            if (bool.booleanValue()) {
                AppRestartUtil.restartAppHard(context);
                return;
            }
            str = "launcher values will take effect at next cold start";
        }
        C63813iO.A01(context, str);
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$8(Context context, Boolean bool, C305221q r4) {
        r4.getClass();
        new Handler(context.getMainLooper()).post(new QuickExperimentHelper$$ExternalSyntheticLambda8(r4, context, bool));
    }

    public static /* synthetic */ void lambda$getSimpleDialog$4(C07950cU r1, EditText editText, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass4MA r4, C10300i6 r5, C34727Idy idy, DialogInterface dialogInterface, int i) {
        RecentQuickExperimentManager.markRecentExperimentParameter(r1);
        if (!TextUtils.isEmpty(AnonymousClass0wJ.A0n(editText))) {
            quickExperimentDebugStore.putOverriddenParameter(r1, AnonymousClass0wJ.A0n(editText));
            r4.A05 = getLabel(r5, r1, quickExperimentDebugStore);
            idy.notifyDataSetChanged();
        }
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void lambda$getSimpleDialog$5(C07950cU r1, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass4MA r3, C10300i6 r4, C34727Idy idy, DialogInterface dialogInterface, int i) {
        RecentQuickExperimentManager.markRecentExperimentParameter(r1);
        quickExperimentDebugStore.putOverriddenParameter(r1, String.valueOf(r1.getDefaultValue()));
        r3.A05 = getLabel(r4, r1, quickExperimentDebugStore);
        idy.notifyDataSetChanged();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void lambda$getSimpleDialog$6(C07950cU r0, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass4MA r2, C10300i6 r3, C34727Idy idy, DialogInterface dialogInterface, int i) {
        RecentQuickExperimentManager.markRecentExperimentParameter(r0);
        quickExperimentDebugStore.removeOverriddenParameter(r0);
        r2.A05 = getLabel(r3, r0, quickExperimentDebugStore);
        idy.notifyDataSetChanged();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void lambda$setupMenuItems$0(UserSession userSession, Fragment fragment, C07950cU r3, View view) {
        C05050Qq.A00(C18180wK.A06(), userSession);
        C18180wK.A17(QuickExperimentEditFragment.createWithUniverse(r3.mUniverseName), C18180wK.A0Q(fragment.requireActivity(), userSession));
    }

    public static ValueAndSource peek(C10300i6 r8, C07950cU r9) {
        C07810cE A00;
        Object valueOf;
        Object defaultValue = r9.getDefaultValue();
        long j = r9.mMobileConfigSpecifier;
        if (r9 instanceof AnonymousClass0e5) {
            A00 = C63803iN.A04(r8, j);
        } else {
            A00 = C63173fJ.A00(j);
        }
        Object obj = null;
        if (A00 == null) {
            return new ValueAndSource((Object) null, (Object) null, defaultValue, AnonymousClass0TN.UNKNOWN);
        }
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A03 = true;
        AnonymousClass0TJ A002 = AnonymousClass0TJ.A00(A0Q);
        A002.A02 = true;
        AnonymousClass0TJ A0Q2 = C18200wM.A0Q();
        A0Q2.A03 = true;
        AnonymousClass0TJ A003 = AnonymousClass0TJ.A00(A0Q2);
        A003.A01 = true;
        int A01 = C18190wL.A01(j);
        if (A01 == 1) {
            obj = Boolean.valueOf(A00.ATv(A002, j));
            valueOf = Boolean.valueOf(A00.ATv(A003, j));
        } else if (A01 == 2) {
            obj = Long.valueOf(A00.AtA(A002, j));
            valueOf = Long.valueOf(A00.AtA(A003, j));
        } else if (A01 == 3) {
            obj = A00.BET(A002, j);
            valueOf = A00.BET(A003, j);
        } else if (A01 != 4) {
            valueOf = null;
        } else {
            obj = Double.valueOf(A00.Adv(A002, j));
            valueOf = Double.valueOf(A00.Adv(A003, j));
        }
        return new ValueAndSource(obj, valueOf, defaultValue, A002.A00.A00);
    }

    public static List setupMenuItems(Fragment fragment, UserSession userSession, List list, C34727Idy idy, boolean z, boolean z2) {
        Object createSimpleMenuItem;
        String str;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (userSession == null) {
            str = "getMenuItems yield with unexpected null user session.";
        } else {
            Context context = fragment.getContext();
            if (context == null) {
                str = "Returning empty menu items due to null parent context, probably the research result returned after user left the search UI";
            } else {
                QuickExperimentDebugStore overrideStore = QuickExperimentDebugStoreManager.getOverrideStore(userSession);
                HashSet A0u = C18200wM.A0u();
                C40290Lbt lbt = null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C07950cU r7 = (C07950cU) it.next();
                    C40290Lbt category = getCategory(r7);
                    if (category != lbt && z) {
                        if (lbt != null) {
                            C63273h9.A02(A0v);
                        }
                        C63613hu.A01(category.A01, A0v);
                        lbt = category;
                    }
                    String niceUniverseName = getNiceUniverseName(r7.mUniverseName);
                    if (!A0u.contains(r7.mUniverseName)) {
                        C63613hu r1 = new C63613hu((CharSequence) niceUniverseName);
                        r1.A00 = context.getColor(R.color.igds_loading_shimmer_light);
                        if (z2) {
                            r1.A0D = fragment.getString(2131835369);
                            QuickExperimentHelper$$ExternalSyntheticLambda4 quickExperimentHelper$$ExternalSyntheticLambda4 = new QuickExperimentHelper$$ExternalSyntheticLambda4(userSession, fragment, r7);
                            r1.A06 = quickExperimentHelper$$ExternalSyntheticLambda4;
                            r1.A07 = quickExperimentHelper$$ExternalSyntheticLambda4;
                        }
                        A0v.add(r1);
                        A0u.add(r7.mUniverseName);
                    }
                    if (C18190wL.A01(r7.mMobileConfigSpecifier) == 1) {
                        createSimpleMenuItem = createSwitchItem(userSession, r7, overrideStore, idy);
                    } else {
                        createSimpleMenuItem = createSimpleMenuItem(context, userSession, r7, overrideStore, idy);
                    }
                    A0v.add(createSimpleMenuItem);
                }
                return A0v;
            }
        }
        AnonymousClass0LU.A0C(TAG, str);
        return A0v;
    }

    public static List setupMenuItems(Fragment fragment, UserSession userSession, List list, C34727Idy idy, boolean z) {
        return setupMenuItems(fragment, userSession, list, idy, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (getNamedParamsRatio(r3) > 0.9d) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3IC getParamsMap() {
        /*
            java.lang.Object r8 = PARAMS_MAP_CACHE_LOCK
            monitor-enter(r8)
            X.3IC r3 = mCachedParamsMap     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x0034
            X.3zp r7 = getDeviceSessionMobileConfig()     // Catch:{ all -> 0x0038 }
            r6 = 0
            if (r7 == 0) goto L_0x0036
            X.3IC r3 = r7.A09()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0036
            double r1 = getNamedParamsRatio(r3)     // Catch:{ all -> 0x0038 }
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0032
            r7.A0B()     // Catch:{ all -> 0x0038 }
            X.3IC r3 = r7.A09()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0036
            double r1 = getNamedParamsRatio(r3)     // Catch:{ all -> 0x0038 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
        L_0x0032:
            mCachedParamsMap = r3     // Catch:{ all -> 0x0038 }
        L_0x0034:
            monitor-exit(r8)     // Catch:{ all -> 0x0038 }
            return r3
        L_0x0036:
            monitor-exit(r8)     // Catch:{ all -> 0x0038 }
            return r6
        L_0x0038:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.getParamsMap():X.3IC");
    }
}
