package X;

import android.util.Pair;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.util.concurrent.Callable;

/* renamed from: X.84b  reason: invalid class name and case insensitive filesystem */
public final class C1367184b implements Callable {
    public final /* bridge */ /* synthetic */ Object call() {
        int length;
        Object obj;
        String[] list = C86144wL.A0Z("/proc/self/task").list();
        if (list == null || (length = list.length) == 0) {
            return null;
        }
        StringBuilder A0s = C86114wI.A0s(length << 4);
        for (String A0V : list) {
            try {
                Pair A00 = C03620Ka.A00(AnonymousClass00U.A0V("/proc/self/task/", A0V, "/comm"));
                if (((Integer) A00.second).intValue() == 0 && (obj = A00.first) != null) {
                    String str = (String) obj;
                    if (str.length() != 0) {
                        if (str.startsWith("X.")) {
                            A0s.append(str);
                        } else {
                            boolean z = false;
                            for (int i = 0; i < str.length(); i++) {
                                char charAt = str.charAt(i);
                                if (charAt >= '0') {
                                    if (charAt <= '9') {
                                        if (!z) {
                                            A0s.append("###");
                                            z = true;
                                        }
                                    }
                                } else if (charAt == ' ') {
                                    charAt = '_';
                                }
                                A0s.append(charAt);
                                z = false;
                            }
                        }
                        A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return A0s.substring(0, A0s.length() - 1);
    }
}
