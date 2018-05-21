package list.adapter;

import android.content.Context;

import java.util.List;

import list.address.sing.addresslistdemo.R;
import list.model.MeiTuanBean;
import list.utils.CommonAdapter;
import list.utils.ViewHolder;

/**
 * Created by zhangxutong .
 * Date: 16/08/28
 */

public class MeituanAdapter extends CommonAdapter<MeiTuanBean> {
    public MeituanAdapter(Context context, int layoutId, List<MeiTuanBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(ViewHolder holder, final MeiTuanBean cityBean) {
        holder.setText(R.id.tvCity, cityBean.getCity());
    }
}