package X;

import android.view.View;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.69X  reason: invalid class name */
public enum AnonymousClass69X {
    ;

    public static AnonymousClass69X A02(String str, int i) {
        return new AnonymousClass69X(str, i);
    }

    public static AnonymousClass69X A00(View view) {
        AnonymousClass69V r0 = (AnonymousClass69V) view.getTag(R.id.role);
        if (r0 == null) {
            return (AnonymousClass69X) view.getTag(R.id.accessibility_role);
        }
        switch (r0.ordinal()) {
            case 0:
                return A02;
            case 5:
                return A03;
            case 7:
                return A04;
            case 9:
                return A05;
            case 19:
                return A06;
            case 21:
                return A07;
            case 22:
                return A08;
            case 23:
                return A0A;
            case 24:
                return A0B;
            case 30:
                return A0C;
            case 31:
                return A0D;
            case 32:
                return A0E;
            case 35:
                return A0F;
            case 39:
                return A0G;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return A0H;
            case Seq.NULL_REFNUM /*41*/:
                return A0I;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return A0J;
            case 47:
                return A0K;
            case 49:
                return A01;
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return A0L;
            case 52:
                return A0M;
            case 53:
                return A0N;
            case 54:
                return A0O;
            case 56:
                return A0P;
            case 59:
                return A0Q;
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return A0S;
            default:
                return null;
        }
    }

    public static AnonymousClass69X A01(String str) {
        for (AnonymousClass69X r1 : values()) {
            if (r1.name().equalsIgnoreCase(str)) {
                return r1;
            }
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid accessibility role value: ", str));
    }

    public static String A03(AnonymousClass69X r1) {
        switch (r1.ordinal()) {
            case 0:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 15:
            case 16:
            case LangUtils.HASH_SEED /*17*/:
            case 18:
            case 19:
            case 21:
            case 22:
            case 25:
            case Rfc3492Idn.tmax /*26*/:
            case 27:
            case Rfc3492Idn.skew /*38*/:
                return "android.view.View";
            case 1:
                return "android.widget.Button";
            case 2:
                return "android.widget.Spinner";
            case 3:
                return "android.widget.ToggleButton";
            case 5:
                return "android.widget.EditText";
            case 6:
                return "android.widget.ImageView";
            case 7:
                return "android.widget.ImageButton";
            case 8:
                return "android.inputmethodservice.Keyboard$Key";
            case 9:
                return "android.widget.TextView";
            case 10:
                return "android.widget.SeekBar";
            case 14:
                return "android.widget.CheckBox";
            case 20:
                return "android.widget.RadioButton";
            case 23:
                return "android.widget.SpinButton";
            case 24:
                return "android.widget.Switch";
            case 28:
                return "android.widget.AbsListView";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "android.widget.GridView";
            case 30:
                return "androidx.viewpager.widget.ViewPager";
            case 31:
                return "android.widget.ScrollView";
            case 32:
                return "android.widget.HorizontalScrollView";
            case 33:
                return "android.view.ViewGroup";
            case 34:
                return "android.webkit.WebView";
            case 35:
                return "androidx.drawerlayout.widget.DrawerLayout";
            case Rfc3492Idn.base /*36*/:
                return "android.widget.SlidingDrawer";
            case LangUtils.HASH_OFFSET /*37*/:
                return "com.android.internal.view.menu.IconMenuView";
            default:
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("Invalid accessibility role value: ", r1));
        }
    }
}
