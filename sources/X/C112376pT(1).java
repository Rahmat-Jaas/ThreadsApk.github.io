package X;

import android.text.TextUtils;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6pT  reason: invalid class name and case insensitive filesystem */
public final class C112376pT {
    public Integer A00;
    public String A01;
    public Throwable A02;

    public final AnonymousClass6CW A00() {
        String str;
        if (this.A00 != null) {
            if (TextUtils.isEmpty(this.A01)) {
                switch (this.A00.intValue()) {
                    case 1:
                        str = "Failed to cache asset";
                        break;
                    case 2:
                        str = "Failed to retrieve cached asset";
                        break;
                    case 3:
                        str = "Got exception when creating DownloadService";
                        break;
                    case 4:
                        str = "No file downloaded";
                        break;
                    case 5:
                        str = "Md5 checksum mismatch";
                        break;
                    case 6:
                        str = "Download was cancelled internally";
                        break;
                    case 7:
                    case 10:
                    case 16:
                    case LangUtils.HASH_SEED /*17*/:
                    case 18:
                        str = "";
                        break;
                    case 8:
                        str = "Failed to download the model metadata";
                        break;
                    case 9:
                        str = "Failed to download the script package metadata";
                        break;
                    case 11:
                        str = "Failed to fetch scripting package";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str = "Failed to create model from local assets";
                        break;
                    case 13:
                        str = "Failed to load voltron module";
                        break;
                    case 14:
                        str = "Asset cache key missing";
                        break;
                    case 15:
                        str = "Failed to create request asset";
                        break;
                    case 19:
                        str = "failure for async assets";
                        break;
                    case 20:
                        str = "device is disconnected";
                        break;
                    case 21:
                        str = "request exceeds the timeout";
                        break;
                    case 22:
                        str = "request is interrupted";
                        break;
                    case 23:
                        str = "Failed to decrypt asset";
                        break;
                    case 24:
                        str = "Failed to encode asset";
                        break;
                    case 25:
                        str = "Failed to check if capability supported";
                        break;
                    case Rfc3492Idn.tmax /*26*/:
                        str = "uncategorized";
                        break;
                    default:
                        str = "Failed to decompress file";
                        break;
                }
            } else {
                str = this.A01;
            }
            Throwable th = this.A02;
            if (th != null) {
                str = TextUtils.join(";", new String[]{str, th.getMessage()});
            }
            return new AnonymousClass6CW(this.A00, str, this.A02);
        }
        throw C18190wL.A0a("Must set load exception type");
    }
}
