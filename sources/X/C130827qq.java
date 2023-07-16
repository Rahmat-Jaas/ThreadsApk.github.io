package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.7qq  reason: invalid class name and case insensitive filesystem */
public final class C130827qq implements C147078nM {
    public Integer A00;
    public C130887qw A01;
    public String A02;
    public final JsonReader A03;

    public final Integer Bhu() {
        Integer num;
        this.A02 = null;
        this.A01 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = AnonymousClass6YL.A00;
        switch (iArr[peek.ordinal()]) {
            case 1:
                num = AnonymousClass006.A0Y;
                break;
            case 2:
                num = AnonymousClass006.A15;
                break;
            case 3:
                num = AnonymousClass006.A1L;
                break;
            case 4:
                num = AnonymousClass006.A00;
                break;
            case 5:
                num = AnonymousClass006.A01;
                break;
            case 6:
                num = AnonymousClass006.A0C;
                break;
            case 7:
                num = AnonymousClass006.A0N;
                break;
            case 8:
                num = AnonymousClass006.A02;
                break;
            case 9:
                num = AnonymousClass006.A1C;
                break;
            case 10:
                num = AnonymousClass006.A0j;
                break;
            default:
                throw C18180wK.A0a(AnonymousClass0wJ.A0t("unknown JsonToken ", peek));
        }
        this.A00 = num;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A01 = new C130887qw(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw C18180wK.A0a("unknown JsonToken ");
        }
        return this.A00;
    }

    public final Object Acn() {
        return this.A03;
    }

    public final String CWO() {
        return this.A02;
    }

    public final Integer CWR() {
        return this.A00;
    }

    public final C146328m3 CWS() {
        return this.A01;
    }

    public final void CuL() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass006.A00;
        if (num == num2 || num == AnonymousClass006.A0C) {
            int i = 1;
            while (true) {
                Integer Bhu = Bhu();
                if (Bhu == num2 || Bhu == AnonymousClass006.A0C) {
                    i++;
                } else if (Bhu == AnonymousClass006.A01 || Bhu == AnonymousClass006.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C130827qq(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }
}
