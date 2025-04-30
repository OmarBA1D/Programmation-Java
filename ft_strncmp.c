/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strncmp.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 16:54:41 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 17:26:37 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>
#include <string.h>

int	ft_strncmp(const char *s1, const char *s2, size_t n)
{
	if (n == 0)
		return (0);
	while (n-- > 0 && (*s1 || *s2))
	{
		if (*s1 != *s2)
			return (*(unsigned char *)s1 - *(unsigned char *)s2);
		s1++;
		s2++;
	}
	return (0);
}
/*
int	main(void)
{
	const char	*str1;
	const char	*str2;
	size_t		n;
	int		result;

	str1 = "abcde";
	str2 = "abCde";
	n = 3;
	result = ft_strncmp(str1, str2, n);
	if (result < 0)
		printf("'%s' < '%s' (primeros %zu chars)\n", str1, str2, n);
	else if (result > 0)
		printf("'%s' > '%s' (primeros %zu chars)\n", str1, str2, n);
	else
		printf("'%s' == '%s' (primeros %zu chars)\n", str1, str2, n);
	return (0);
}*/
