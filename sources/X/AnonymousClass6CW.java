package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Set;

/* renamed from: X.6CW  reason: invalid class name */
public final class AnonymousClass6CW extends Exception {
    public static final Set A01 = C86114wI.A0t(new String[]{TraceFieldType.ErrorCode, TraceFieldType.ErrorDomain, DevServerEntity.COLUMN_DESCRIPTION});
    public final Integer A00;

    public AnonymousClass6CW(Integer num, String str, Throwable th) {
        super(str, th);
        this.A00 = num;
    }

    public final String A00() {
        String message;
        try {
            StringWriter A0d = C18230wP.A0d();
            JsonWriter jsonWriter = new JsonWriter(A0d);
            jsonWriter.beginObject();
            jsonWriter.name(TraceFieldType.ErrorDomain).value(AnonymousClass6GS.A00(this.A00));
            if (!TextUtils.isEmpty((CharSequence) null)) {
                jsonWriter.name(TraceFieldType.ErrorCode).value((String) null);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name(DevServerEntity.COLUMN_DESCRIPTION);
                if (getMessage().length() > 200) {
                    message = getMessage().substring(0, 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            jsonWriter.endObject();
            return A0d.toString();
        } catch (IOException unused) {
            return "";
        }
    }
}
