package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5CA  reason: invalid class name */
public final class AnonymousClass5CA extends AnonymousClass5CI {
    public final Pattern A00 = Pattern.compile("\\A\\d+");

    public final boolean A01() {
        boolean A01 = super.A01();
        if (!A01 || Build.VERSION.SDK_INT >= 29) {
            return A01;
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.A00.matcher(currentWebViewPackage.versionName);
        if (!matcher.find() || Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) < 105) {
            return false;
        }
        return true;
    }
}
