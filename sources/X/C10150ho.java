package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.0ho  reason: invalid class name and case insensitive filesystem */
public final class C10150ho extends LayoutInflater {
    public static final String[] A00 = {"android.widget.", "android.webkit.", "android.app."};

    public final LayoutInflater cloneInContext(Context context) {
        return new C10150ho(context);
    }

    public final View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = A00;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                View createView = createView(str, strArr[i], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }

    public C10150ho(Context context) {
        super(context);
    }
}
