def sum(n)
  def rec tailsum(n, acc)
  if n == 0
    return acc
  else
    return tailsum(n - 1, acc + n)
  end
  end

  return tailsum(n, 0)
end