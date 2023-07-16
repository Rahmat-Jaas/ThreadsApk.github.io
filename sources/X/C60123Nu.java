package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.3Nu  reason: invalid class name and case insensitive filesystem */
public final class C60123Nu {
    public static String A00(C29801zK r6) {
        StringBuilder A0s = C18190wL.A0s("{");
        A0s.append("viewer()");
        A0s.append("{");
        A0s.append("eligible_promotions.trigger_context_v2(<trigger_context_v2>).ig_parameters(<ig_parameters>).trigger_name(<trigger_name>).surface_nux_id(<surface>).external_gating_permitted_qps(<external_gating_permitted_qps>).supports_client_filters(true).include_holdouts(true)");
        A0s.append("{");
        A0s.append("edges");
        A0s.append("{");
        A0s.append("client_ttl_seconds,log_eligibility_waterfall,is_holdout,priority,");
        A0s.append("time_range");
        A0s.append("{start,end},");
        A0s.append("node{");
        A0s.append("id,promotion_id,logging_data,is_server_force_pass,max_impressions,triggers,");
        A0s.append("contextual_filters");
        A0s.append("{");
        A0s.append("clause_type,");
        A0s.append("filters{");
        A0s.append("filter_type,unknown_action,");
        A0s.append("value{");
        A0s.append("name,required,bool_value,int_value,string_value");
        A0s.append("},");
        A0s.append("extra_datas{name,required,bool_value,int_value,string_value}");
        A0s.append("}");
        A01(A0s);
        A01(A0s);
        A01(A0s);
        A0s.append("}");
        A0s.append("}");
        A0s.append("}");
        A0s.append("},");
        A0s.append("is_uncancelable,");
        A0s.append("template{");
        A0s.append("name,parameters{");
        C18230wP.A1S("name,required,bool_value,string_value,color_value", "}", "},", A0s);
        A0s.append("creatives{");
        A0s.append("title{text},");
        A0s.append("content{text},");
        A0s.append("footer{text},");
        A0s.append("social_context{text},");
        A0s.append("social_context_images,");
        A0s.append("primary_action{");
        A0s.append("title{text},");
        A0s.append("url,limit,dismiss_promotion");
        A0s.append("},");
        C18230wP.A1S("secondary_action{", "title{text},", "url,limit,dismiss_promotion", A0s);
        A0s.append("},");
        C18230wP.A1S("dismiss_action{", "title{text},", "url,limit,dismiss_promotion", A0s);
        A0s.append("},");
        A0s.append("bullet_list{");
        A0s.append("title,subtitle,icon{uri,width,height}");
        A0s.append("}");
        A0s.append("image.scale(<scale>){");
        A0s.append("uri,width,height");
        A0s.append("}");
        if (r6.equals(C29801zK.DARK_MODE)) {
            C18230wP.A1S(",dark_mode_image.scale(<scale>){", "uri,width,height", "}", A0s);
        }
        A0s.append("}");
        A0s.append("}");
        A0s.append("}");
        A0s.append("}");
        A0s.append("}");
        return StringFormatUtil.formatStrLocaleSafe("Query QuickPromotionSurfaceQuery: Viewer%s", (Object) C18180wK.A0i("}", A0s));
    }

    public static void A01(StringBuilder sb) {
        sb.append(",clauses{");
        sb.append("clause_type,");
        sb.append("filters{");
        sb.append("filter_type,unknown_action,");
        sb.append("value{");
        sb.append("name,required,bool_value,int_value,string_value");
        sb.append("},");
        sb.append("extra_datas{name,required,bool_value,int_value,string_value}");
        sb.append("}");
    }
}
