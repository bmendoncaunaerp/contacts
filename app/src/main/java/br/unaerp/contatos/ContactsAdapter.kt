package br.unaerp.contatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(
    private val contactList: List<String>,
    private val contactClickListener: ContactClickListener
    ) :
    RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>() {

    interface ContactClickListener {
        fun onItemClicked(item: String)
    }

    inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setInfo(contactName: String) {
            val imgContact: ImageView = itemView.findViewById(R.id.imgContact)
            val tvContactName: TextView = itemView.findViewById(R.id.tvContactName)
            tvContactName.text = contactName
            imgContact.setOnClickListener {
                contactClickListener.onItemClicked(contactName)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.setInfo(contactList[position])
    }
}