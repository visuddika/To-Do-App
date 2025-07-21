package com.example.TodoAppSLEEP.view.adapters.delegates

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.TodoAppSLEEP.databinding.ItemCaseBinding
import com.example.TodoAppSLEEP.model.cases.Case
import com.example.TodoAppSLEEP.view.adapters.CasesAdapter
import com.example.TodoAppSLEEP.view.adapters.Delegate
import com.example.TodoAppSLEEP.view.adapters.ItemList

class CaseDelegate(context: Context) : Delegate {

    override fun forItem(itemList: ItemList) = itemList is Case

    override fun getViewHolder(parent: ViewGroup, clickListener: OnClickListener): CasesAdapter.CaseViewHolder {

        val binding = ItemCaseBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        binding.moreCaseButton.setOnClickListener(clickListener)

        return CasesAdapter.CaseViewHolder(binding)
    }

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: ItemList) {
        (viewHolder as CasesAdapter.CaseViewHolder).let { caseViewHolder ->
            val case = item as Case
            Log.d("nasha", case.date.toString())
            caseViewHolder.binding.moreCaseButton.tag = case
            val sdf = java.text.SimpleDateFormat("HH:mm dd-MM-yyyy")
            caseViewHolder.binding.comment.text = case.comment
            caseViewHolder.binding.dateTV.text = (sdf.format(case.date)).toString()
        }
    }
}