package org.cazait.cazait_android.ui.view.cafelist.info.inner

import MarginItemDecoration
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import org.cazait.cazait_android.R
import org.cazait.cazait_android.databinding.FragmentCafeMenuBinding
import org.cazait.cazait_android.ui.adapter.CafeInfoMenuAdapter
import org.cazait.cazait_android.ui.base.BaseFragment
import org.cazait.cazait_android.ui.viewmodel.CafeInfoMenuViewModel
import kotlin.math.roundToInt

@AndroidEntryPoint
class CafeMenuFragment : BaseFragment<FragmentCafeMenuBinding, CafeInfoMenuViewModel>() {

    override val layoutResourceId: Int
        get() = R.layout.fragment_cafe_menu

    override val viewModel: CafeInfoMenuViewModel by viewModels()
    private val menuAdapter = CafeInfoMenuAdapter()

    override fun initBeforeBinding() {
        binding.lifecycleOwner = this
    }
    override fun initAfterBinding() {
        observeMenuListData()
    }
    override fun initView() {
        initRecyclerView()
        binding.apply {
            swipefreshMenu.setOnRefreshListener {
                swipefreshMenu.isRefreshing = false
            }
        }
    }

    private fun initRecyclerView() {
        val spaceDecoration = MarginItemDecoration(resources.getDimension(R.dimen.cafe_info_menu_bottom_space).roundToInt())
        val recyclerView = binding.rvCafeInfoMenus
        recyclerView.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        recyclerView.addItemDecoration(spaceDecoration)
        recyclerView.adapter = menuAdapter
    }

    private fun observeMenuListData() {
        viewModel.cafeMenuList.observe(this) {
            menuAdapter.data = it
        }
    }
}