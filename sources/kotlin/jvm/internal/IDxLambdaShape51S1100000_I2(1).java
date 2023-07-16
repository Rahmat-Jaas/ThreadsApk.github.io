package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C08390dI;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.Unit;

public class IDxLambdaShape51S1100000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public String A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape51S1100000_I2(C08390dI r2, String str, int i) {
        super(1);
        this.A02 = i;
        this.A00 = r2;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        SharedPreferences.Editor putString;
        switch (this.A02) {
            case 0:
                putString = ((C08390dI) this.A00).A0C().edit().putBoolean(this.A01, ((Boolean) obj).booleanValue());
                break;
            case 1:
                putString = ((C08390dI) this.A00).A0C().edit().putInt(this.A01, ((Number) obj).intValue());
                break;
            case 2:
                str = (String) obj;
                break;
            case 3:
                str = (String) obj;
                C04220Ms.A0B(str, 0);
                break;
            default:
                Set set = (Set) obj;
                C04220Ms.A0B(set, 0);
                putString = ((C08390dI) this.A00).A0C().edit().putStringSet(this.A01, set);
                break;
        }
        putString = ((C08390dI) this.A00).A0C().edit().putString(this.A01, str);
        putString.apply();
        return Unit.A00;
    }
}
