/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_calloc.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 18:35:30 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/24 12:05:19 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>
#include <limits.h>
#include <stdint.h>

void	*ft_calloc(size_t count, size_t size)
{
	void	*s;

	if (count == SIZE_MAX || size == SIZE_MAX)
		return (NULL);
	s = malloc(count * size);
	if (s == NULL)
		return (NULL);
	else
		return (ft_memset(s, 0, count * size));
}
/*
int	main(void)
{
	int *arr = ft_calloc(5, sizeof(int));
	printf("Calloc test:\n");
	int i;
	
	i = 0;
	while (i < 5)
	{
		printf("%d", arr[i]);
		i++;
	}
	printf("\n\n");
	free(arr);
	return (0);
}*/
