package sing.addressList.helper;

import java.util.List;

import sing.addressList.bean.BaseIndexPinyinBean;

/**
 * SideBar 的 数据相关帮助类
 * 1 将汉语转成拼音
 * 2 填充indexTag
 * 3 排序源数据源
 * 4 根据排序后的源数据源--》indexBar的数据源
 */

public interface ISideBarDataHelper {
    //汉语-》拼音
    ISideBarDataHelper convert(List<? extends BaseIndexPinyinBean> data);

    //拼音->tag
    ISideBarDataHelper fillInexTag(List<? extends BaseIndexPinyinBean> data);

    //对源数据进行排序（RecyclerView）
    ISideBarDataHelper sortSourceDatas(List<? extends BaseIndexPinyinBean> datas);

    //对IndexBar的数据源进行排序(右侧栏),在 sortSourceDatas 方法后调用
    ISideBarDataHelper getSortedIndexDatas(List<? extends BaseIndexPinyinBean> sourceDatas, List<String> datas);
}