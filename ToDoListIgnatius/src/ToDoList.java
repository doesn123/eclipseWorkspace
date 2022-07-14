
public class ToDoList {



	# ToDoList.rb

	class ToDoList
	 def initialize()
	 @items = []
	 end

	 def add(item)
	 @items.push item
	 end
	end

	---

	# Item.rb

	class Item
	 def initialize(name)
	 @name = name
	 @completion = false
	 @priority = "High"
	 end

	 def setName(name)
	 @name = name
	 end

	 def setPriority(prio)
	 @priority = prio
	 end

	 def complete
	 @completion = true
	 end
	end
}
